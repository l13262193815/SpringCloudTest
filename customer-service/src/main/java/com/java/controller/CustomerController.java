package com.java.controller;

import com.java.client.UserClient;
import com.java.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
//@DefaultProperties(defaultFallback = "queryBack")//本类中的所有方法都使用熔断器
public class CustomerController {
    @Autowired
    private UserClient client;
    /*@Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;//eureka客户端*/

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


    /*@GetMapping("/{i}")
    public User getUser(@PathVariable("i") Long i){
        String url ="http://user-service/user/"+i;
        User user = restTemplate.getForObject(url,User.class);
        return user;
    }*/

    /*@GetMapping("/{i}")
    @HystrixCommand//本方法使用熔断器
    public String getUser(@PathVariable("i") Long i) {
        String url = "http://user-service/user/" + i;
        String user = restTemplate.getForObject(url, String.class);
        return user;
    }*/

    @GetMapping("/{i}")
    public User getUser(@PathVariable("i") Long i) {
        System.out.println("方法");
        /*String url = "http://user-service/user/" + i;
        String user = restTemplate.getForObject(url, String.class);*/
        return client.queryUserById(i);
    }

    //当访问失败,调用此方法
    public String queryBack(){
        return "现在网络延迟";
    }

}
