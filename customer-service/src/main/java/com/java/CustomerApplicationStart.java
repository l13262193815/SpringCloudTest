package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 客户端启动器
 */
/*@EnableDiscoveryClient//eureka客户端
@SpringBootApplication//SpringBoot启动器
@EnableCircuitBreaker//开启熔断器*/
@SpringCloudApplication//三合一注解
@EnableFeignClients//开启feign
public class CustomerApplicationStart {
    /*@Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplicationStart.class,args);
    }
}
