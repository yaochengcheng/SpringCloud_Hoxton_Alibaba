package com.atguigu.cloud.service;

import com.atguigu.cloud.entity.Payment;

/**
 * @author ycc
 * @created 2021/2/19 11:23
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
