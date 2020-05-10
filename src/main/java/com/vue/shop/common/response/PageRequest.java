package com.vue.shop.common.response;

import lombok.Data;

@Data
public class PageRequest<T> extends BaseRequest{
    private int currentPage;
    private int size;
    private int total;
    private T data;
}
