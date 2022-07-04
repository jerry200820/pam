package com.xinrong.pam.user.mapper;

import com.xinrong.pam.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Jerry_shi34268
 * @Date: 2022/7/4 16:36
 * @Description:
 */
@Repository
public interface UserMapper {

    List<User> getAll();
}
