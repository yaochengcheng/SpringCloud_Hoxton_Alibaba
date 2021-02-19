package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ycc
 * @created 2021/2/19 15:14
 */
@SpringBootApplication
// 此类作为Eureka Server的服务注册端
@EnableEurekaServer
public class EurekaMainApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication_7001.class, args);
    }
}
