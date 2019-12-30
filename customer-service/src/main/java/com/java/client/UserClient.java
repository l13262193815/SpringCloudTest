package com.java.client;

import com.java.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service",fallback = UserFallbackClient.class)
public interface UserClient {
    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable("id") Long id);
}
