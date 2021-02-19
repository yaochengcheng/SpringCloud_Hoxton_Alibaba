package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ycc
 * @created 2021/2/19 9:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PayMainApplication_8001 {

    public static void main(String[] args) {
        SpringApplication.run(PayMainApplication_8001.class, args);
    }
}
