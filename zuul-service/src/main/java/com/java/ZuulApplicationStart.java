package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * 启动类
 */
@EnableDiscoveryClient//Eureka客户端
@EnableZuulProxy//开启代理网关服务
@SpringBootApplication
public class ZuulApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplicationStart.class,args);
    }
}
