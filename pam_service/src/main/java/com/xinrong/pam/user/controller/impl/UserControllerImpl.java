package com.xinrong.pam.user.controller.impl;

import com.xinrong.pam.user.controller.UserController;
import com.xinrong.pam.user.domain.User;
import com.xinrong.pam.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 16:29
 * @Description:
 */
@RestController
public class UserControllerImpl implements UserController {
   @Autowired
    UserService userService;


    @Override
    public List<User> getAll() {
        return userService.getAll();
    }
}
