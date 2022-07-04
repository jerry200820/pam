package com.xinrong.pam.user.controller;

import com.xinrong.pam.user.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 16:22
 * @Description:
 */

@RestController
@RequestMapping("/controller/pam/user")
public interface UserController {
    @RequestMapping("/getAll")
    List<User> getAll();
}
