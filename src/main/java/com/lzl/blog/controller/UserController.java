package com.lzl.blog.controller;

import com.lzl.blog.consts.CodeConst;
import com.lzl.blog.consts.PathConst;
import com.lzl.blog.entity.UserDetail;
import com.lzl.blog.enums.StatusEnum;
import com.lzl.blog.reponse.CommonResponse;
import com.lzl.blog.service.UserService;
import com.lzl.blog.util.CommonUtil;
import com.lzl.blog.util.MD5Util;
import com.lzl.blog.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(PathConst.USER_ROOT_PATH)
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;





    /**
     * 用户注册
     * @param userDetail
     * @return
     */
    @RequestMapping(value = PathConst.USER_REGISTER,method = RequestMethod.POST)
    public CommonResponse register(@RequestBody UserDetail userDetail){
        if (null == userDetail){
            logger.error("userDetail is null");
            return CommonResponse.Response(StatusEnum.FAILURE);
        }
        try {
            CommonResponse response = CommonUtil.validateParams(userDetail);
            if (CodeConst.SUCCESS != response.getCode()) {
                logger.error("userName or password is null,userName:{}",userDetail.getUserName());
                return response;
            }
            UserDetail user = userService.selectByUserName(userDetail.getUserName());
            if (null != user){
                logger.error("user has exists,userName:{}",userDetail.getUserName());
                return CommonResponse.Response(StatusEnum.USER_EXISTS);
            }
            userService.saveUser(userDetail);
        } catch (Exception e) {
            logger.error("register error",e);
            e.printStackTrace();
            return CommonResponse.Response(StatusEnum.FAILURE);
        }
        logger.info("user register success,userName:{}",userDetail.getUserName());
        return  CommonResponse.Response(StatusEnum.SUCCESS);
    }

    /**
     * 用户登录
     * @param userName
     * @param password
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = PathConst.USER_LOGIN,method = RequestMethod.POST)
    public CommonResponse register(@RequestParam String userName,
                                   @RequestParam String password,
                                   HttpServletRequest request,
                                   HttpServletResponse response
                                   ){
        UserDetail userDetail = new UserDetail(userName, password);
        CommonResponse result = CommonUtil.validateParams(userDetail);
        if (CodeConst.SUCCESS != result.getCode()) {
            logger.error("userName or password is null,userName:{}",userDetail.getUserName());
            return result;
        }
        int count = 0;
        String key = userName + "loginErrorCount";
        try {
            boolean isExists = redisUtil.hasKey(key);
            if (isExists){
                count = (int) redisUtil.get(key);
            }else {
                redisUtil.set(key,0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (count > 5){
            logger.error("login error 5 times,lock 10 minutes,userName:{}",userName);
            redisUtil.expire(key,60);
            return CommonResponse.Response(StatusEnum.USER_LOCKED);
        }
        UserDetail user = userService.selectByUserName(userName);
        boolean valid = MD5Util.valid(password, user.getPassword());
        if (!valid){
            redisUtil.incr(key,1);
            return CommonResponse.Response(StatusEnum.USER_OR_PASSWORD_ERROR);
        }
        request.getSession().setAttribute(CodeConst.LOGIN_SESSION_KEY, user);
        return CommonResponse.Response(StatusEnum.SUCCESS);
    }
}
