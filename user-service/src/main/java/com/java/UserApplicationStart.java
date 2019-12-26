package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 服务端启动器
 */
@EnableDiscoveryClient//Eureka的客户端
@SpringBootApplication
@MapperScan("com.java.mapper")//扫描所有的mapper并创建实现类
public class UserApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(UserApplicationStart.class,args);
    }
}
