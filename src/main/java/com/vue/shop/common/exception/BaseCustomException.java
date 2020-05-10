package com.vue.shop.common.exception;

import com.vue.shop.common.response.ResultCode;

public class BaseCustomException extends RuntimeException{
    private ResultCode resultCode;

    public BaseCustomException(ResultCode resultCode){
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public void setResultCode(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
