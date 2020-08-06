package com.wang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class MyLB implements LoadBalancer {

    // 设置初始机器数是0
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){

        int current; // 当前数值
        int next;  // 下一次的数值
        // 类比源码的自旋锁的方式，来返回
        do {
            current = this.atomicInteger.get();// 获取当前机器数
            next = current >= 2147483647 ? 0 : current+1;// 使用三目运算，来判断，2147483647是Integer的最大值

        }while (!this.atomicInteger.compareAndSet(current,next));// 使用CAS来进行判断
        System.out.println("******第几次访问，次数：next: "+next);

        return  next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {

        //获取下标值
        int index = getAndIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
