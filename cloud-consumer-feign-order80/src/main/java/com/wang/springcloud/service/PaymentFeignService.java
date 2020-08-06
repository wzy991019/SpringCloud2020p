package com.wang.springcloud.service;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
// 根据微服务名称（暴露在微服务端）  来进行调用服务的方法
// 接口+注解   的方法
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    // feign在service层直接进行负载均衡调用
    // 相当于封装了service层
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    // feign 的超时处理
    @GetMapping("/payment/feign/timeout")
    String paymentFeignTimeout();
}
