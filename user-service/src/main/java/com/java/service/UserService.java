package com.java.service;

import com.java.mapper.UserMapper;
import com.java.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public User queryUserById(Long id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
