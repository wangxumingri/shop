package com.vue.shop.common.response;

import java.io.Serializable;

public class ResponseResult implements Serializable {

    //操作是否成功
    private boolean success = true;

    //操作代码
    private int code = 10000;

    //提示信息
    private String message;

    private Object data;

    private ResponseResult(ResultCode resultCode){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
    }


    private ResponseResult(ResultCode resultCode,Object data){
        this.success = resultCode.success();
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }


    public static ResponseResult SUCCESS(){
        return new ResponseResult(CommonCode.SUCCESS);
    }
    public static ResponseResult SUCCESS(Object data){
        return new ResponseResult(CommonCode.SUCCESS,data);
    }
    public static ResponseResult FAIL(){
        return new ResponseResult(CommonCode.FAIL);
    }

    public static ResponseResult FAIL(ResultCode resultCode){
        return new ResponseResult(resultCode);
    }


    public static ResponseResult RESPONSE(ResultCode resultCode,Object data){
        return new ResponseResult(resultCode,data);
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
