package com.xinrong.pam.user.service.impl;

import com.xinrong.pam.user.domain.User;
import com.xinrong.pam.user.mapper.UserMapper;
import com.xinrong.pam.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 16:35
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}
