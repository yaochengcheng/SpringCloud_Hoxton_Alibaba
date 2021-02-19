package com.atguigu.cloud.controller;

import com.atguigu.cloud.config.CommonResult;
import com.atguigu.cloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ycc
 * @created 2021/2/19 11:48
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class OrderController {

    // 此处改为服务名，地址不再写死
    public static final String PAYMENT_URL="http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/create")
    public CommonResult<Payment> creat(Payment payment) {
        System.out.println("payment" + payment);
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/get/{id}")
    public CommonResult<Payment> creat(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL+"/payment//get/"+id, CommonResult.class);
    }
}
