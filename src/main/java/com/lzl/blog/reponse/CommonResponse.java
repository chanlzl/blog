package com.lzl.blog.reponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.lzl.blog.enums.StatusEnum;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResponse<T> {

    private int code;

    private String message;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private CommonResponse() {
    }

    private CommonResponse(StatusEnum code) {
        this.code = code.getCode();
        this.message = code.getMessage();
    }

    private CommonResponse(int code,String msg) {
        this.code = code;
        this.message = msg;
    }

    private CommonResponse(StatusEnum code,T data) {
        this.code = code.getCode();
        this.message = code.getMessage();
        this.data = data;
    }

    public static <T> CommonResponse<T> Response(StatusEnum code,T data){
        return new CommonResponse<T>(code,data);
    }

    public static <T> CommonResponse<T> Response(int code,String msg){
        return new CommonResponse<T>(code,msg);
    }

    public static  CommonResponse Response(StatusEnum code){
        return new CommonResponse(code);
    }



}
