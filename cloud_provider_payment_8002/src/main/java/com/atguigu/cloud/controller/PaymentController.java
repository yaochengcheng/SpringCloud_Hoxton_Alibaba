package com.atguigu.cloud.controller;

import com.atguigu.cloud.config.CommonResult;
import com.atguigu.cloud.entity.Payment;
import com.atguigu.cloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author ycc
 * @created 2021/2/19 11:26
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult<Integer>(200,"插入成功, serverPort：" + serverPort, result);
        }
        return new CommonResult<Integer>(444,"插入失败, serverPort：" + serverPort, null);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult<Payment>(200,"查询成功, serverPort：" + serverPort, payment);
        }
        return new CommonResult<Payment>(200,"没有对应记录, serverPort：" + serverPort, null);
    }

}
