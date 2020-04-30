package com.sdty.tokentest.entity;

//@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result(){
        this.code = 200;
        this.message ="操作成功";
    }

    public Result(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public static  Result<String> error(Integer code,String msg){
        return  new Result<>(code,msg);
    }

    public Result(T data) {
        this.code = 200;
        this.message ="操作成功";
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
}
