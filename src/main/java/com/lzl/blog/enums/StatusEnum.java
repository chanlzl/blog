package com.lzl.blog.enums;

public enum  StatusEnum {

    SUCCESS(0,"成功"),
    FAILURE(1,"失败"),
    INPUT_PARAMETER_INVALID(10001,"输入参数无效"),
    USER_EXISTS(10002,"用户已存在"),
    USER_OR_PASSWORD_ERROR(10003,"用户已或密码错误"),
    USER_LOCKED(10004,"用户已锁定，请10分钟后登录"),
    UNKNOWN_ERROR(10005,"未知错误"),
    DUPLICATE_ENTRY(10006,"主键重复")
    ;

    private int code;

    private String message;

    StatusEnum( int code,String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
