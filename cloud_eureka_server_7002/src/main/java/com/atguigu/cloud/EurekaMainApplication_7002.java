package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ycc
 * @created 2021/2/19 15:37
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApplication_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication_7002.class, args);
    }
}
