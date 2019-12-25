package com.lzl.blog.exception;

import com.lzl.blog.enums.StatusEnum;

public class BusinessException extends RuntimeException{

    private int code;

    public BusinessException(StatusEnum statusEnum) {
        super(statusEnum.getMessage());
        this.code = statusEnum.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
