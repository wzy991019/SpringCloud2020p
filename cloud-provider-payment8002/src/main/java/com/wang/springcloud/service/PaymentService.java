package com.wang.springcloud.service;

import com.wang.springcloud.entities.Payment;

public interface PaymentService {

        //增加
        Integer create(Payment payment);
        //查找
        Payment getPaymentById(Long id);


}
