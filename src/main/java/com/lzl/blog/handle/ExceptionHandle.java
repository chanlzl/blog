package com.lzl.blog.handle;

import com.lzl.blog.controller.UserController;
import com.lzl.blog.enums.StatusEnum;
import com.lzl.blog.exception.BusinessException;
import com.lzl.blog.reponse.CommonResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResponse handle(Exception e){
        if (e instanceof BusinessException){
            return CommonResponse.Response(((BusinessException) e).getCode(),e.getMessage());
        }else{
            if (e.getMessage().contains("Duplicate entry")){
                return CommonResponse.Response(StatusEnum.DUPLICATE_ENTRY);
            }else{
                logger.error("未知错误");
                return CommonResponse.Response(StatusEnum.UNKNOWN_ERROR);
            }
        }
    }
}
