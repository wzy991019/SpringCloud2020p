package com.wang.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    // 获取机器总数
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
