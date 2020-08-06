package com.wang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * 实现PaymentHystrixService接口
 * 等于其中包含了所有的业务逻辑方法
 * 在此类中就可以对所有的业务逻辑方法进行统一的兜底方法处理了
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
