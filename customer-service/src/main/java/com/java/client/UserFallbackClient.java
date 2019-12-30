package com.java.client;

import com.java.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFallbackClient implements UserClient {
    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setName("网络延迟");
        return user;
    }
}
