//package com.vue.shop.common.response;
//
//import org.springframework.core.MethodParameter;
//import org.springframework.http.MediaType;
//import org.springframework.http.server.ServerHttpRequest;
//import org.springframework.http.server.ServerHttpResponse;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
//
//import java.util.HashMap;
//import java.util.Map;
//
////@ControllerAdvice
//public class MyResponseBodyAdvice implements ResponseBodyAdvice {
//    @Override
//    public boolean supports(MethodParameter returnType, Class converterType) {
//        return true;
//    }
//
//    @Override
//    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
//        Map<String, Object> result = new HashMap<>();
//        result.put("result", body);
//        result.put("success", true);
//        return result;
//    }
//}
