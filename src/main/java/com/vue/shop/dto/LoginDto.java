package com.vue.shop.dto;

import com.vue.shop.model.User;
import lombok.Data;

import java.io.Serializable;

@Data
public class LoginDto implements Serializable {
    private User user;
    private String token;
}
