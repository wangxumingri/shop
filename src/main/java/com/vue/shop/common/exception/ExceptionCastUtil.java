package com.vue.shop.common.exception;

import com.vue.shop.common.response.ResultCode;

public class ExceptionCastUtil {

    /**
     * 抛出异常
     * @param resultCode
     */
    public static void cast(ResultCode resultCode) {
        throw new BaseCustomException(resultCode);
    }
}
