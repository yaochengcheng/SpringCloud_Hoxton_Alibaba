package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ycc
 * @created 2021/2/19 16:09
 */
@SpringBootApplication
@EnableEurekaClient
public class PayMainApplication_8002 {

    public static void main(String[] args) {
        SpringApplication.run(PayMainApplication_8002.class, args);
    }
}
