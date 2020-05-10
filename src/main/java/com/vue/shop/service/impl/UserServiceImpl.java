package com.vue.shop.service.impl;

import com.vue.shop.common.exception.ExceptionCastUtil;
import com.vue.shop.common.response.CommonCode;
import com.vue.shop.common.response.UserResultCode;
import com.vue.shop.dao.UserRepository;
import com.vue.shop.dto.LoginDto;
import com.vue.shop.model.User;
import com.vue.shop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public LoginDto login(User user) {
        if (user == null) {
            ExceptionCastUtil.cast(CommonCode.INVALIDPARAM);
        }
        Optional<User> optional = userRepository.findByUsername(user.getUsername());
        if (optional.isPresent()) {
            User userFromDB = optional.get();
            if (userFromDB.getPassword() != null && userFromDB.getPassword().equals(user.getPassword())) {
                LoginDto loginDto = new LoginDto();
                loginDto.setUser(userFromDB);
                loginDto.setToken("123");
                return loginDto;
            } else {
                ExceptionCastUtil.cast(UserResultCode.NOT_EXIST);
            }
        }
        ExceptionCastUtil.cast(UserResultCode.NOT_EXIST);
        return null;
    }
}
