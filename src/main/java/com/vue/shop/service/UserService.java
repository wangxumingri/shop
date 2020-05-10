package com.vue.shop.service;

import com.vue.shop.dto.LoginDto;
import com.vue.shop.model.User;


public interface UserService {

    LoginDto login(User user);
}
