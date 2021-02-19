package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ycc
 * @created 2021/2/19 11:47
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMainApplication_80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication_80.class, args);
    }
}
