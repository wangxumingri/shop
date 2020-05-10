package com.vue.shop.common.exception;

import com.vue.shop.common.response.CommonCode;
import com.vue.shop.common.response.ResponseResult;
import com.vue.shop.common.response.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

    //捕获Exception异常
    @ExceptionHandler(Exception.class)
    public ResponseResult handlerException(Exception e) {
        return ResponseResult.FAIL(CommonCode.SERVER_ERROR);
    }

    @ExceptionHandler(BaseCustomException.class)
    public ResponseResult handlerCustomerException(BaseCustomException baseCustomException) {
        ResultCode resultCode = baseCustomException.getResultCode();
        return ResponseResult.FAIL(resultCode);
    }
}
