package com.wang.springcloud.dao;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    //增加
    Integer create(Payment payment);
    //查找
    Payment getPaymentById(@Param("id") Long id);
}
