package com.java.controller;

import com.java.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    /*@GetMapping("/{i}")
    public User getUser(@PathVariable("i") Long i){
        User user =  restTemplate.getForObject("http://localhost:8081/user/"+i,User.class);
        return user;
    }*/

//    @GetMapping("/{i}")
//    public User getUser(@PathVariable("i") Long i){
//        //获取服务列表
//        List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
//        ServiceInstance instance = instances.get(0);
//        String url ="http://"+instance.getHost()+":"+instance.getPort()+"/user/"+i;
//        User user = restTemplate.getForObject(url,User.class);
//        return user;
//    }


    @GetMapping("/{i}")
    public User getUser(@PathVariable("i") Long i){
        String url ="http://user-service/user/"+i;
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }

}
