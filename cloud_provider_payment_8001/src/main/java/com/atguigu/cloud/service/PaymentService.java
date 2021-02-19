package com.atguigu.cloud.service;

import com.atguigu.cloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ycc
 * @created 2021/2/19 11:23
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
