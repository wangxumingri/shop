package com.vue.shop.common.response;

public enum UserResultCode implements ResultCode{
    LOG_SUCCESS(true,60000,"登录成功"),
    NOT_EXIST(false,60001,"用户名或密码错误");

    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    UserResultCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
