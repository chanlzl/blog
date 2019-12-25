package com.lzl.blog.service.impl;

import com.lzl.blog.dao.UserDetailMapper;
import com.lzl.blog.entity.UserDetail;
import com.lzl.blog.service.UserService;
import com.lzl.blog.util.CommonUtil;
import com.lzl.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

   @Autowired
    private UserDetailMapper userDetailMapper;

    @Override
    public int saveUser(UserDetail userDetail) throws Exception{
        String uuid = CommonUtil.generateUUID();
        userDetail.setUserId(uuid);
        String md5Pwd = MD5Util.encypt(userDetail.getPassword());
        userDetail.setPassword(md5Pwd);
        return userDetailMapper.insertSelective(userDetail);
    }

    @Override
    public int deleteUser(int userId) {
        return userDetailMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int updateUser(UserDetail userDetail) {
        return userDetailMapper.updateByPrimaryKeySelective(userDetail);
    }

    @Override
    public UserDetail selectUser(int userId) {
        return userDetailMapper.selectByPrimaryKey(userId);
    }

    @Override
    public UserDetail selectByUserName(String username) {
        return userDetailMapper.selectByUserName(username);
    }


}
