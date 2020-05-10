package com.vue.shop.controller;

import com.vue.shop.common.response.ResponseResult;
import com.vue.shop.dto.LoginDto;
import com.vue.shop.model.User;
import com.vue.shop.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @CrossOrigin(origins = "http://192.168.40.130:8888",
@CrossOrigin(origins = "http://localhost:8080",
        maxAge = 3600,
        methods = {RequestMethod.GET, RequestMethod.POST})
    @RequestMapping("/login")
    public ResponseResult login(@RequestBody User user) {
        LoginDto login = userService.login(user);
        return ResponseResult.SUCCESS(login);
    }

}
