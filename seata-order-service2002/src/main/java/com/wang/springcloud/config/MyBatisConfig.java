package com.wang.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wang.springcloud.dao"})
public class MyBatisConfig {
}
