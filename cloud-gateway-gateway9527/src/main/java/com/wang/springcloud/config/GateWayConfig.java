package com.wang.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过编码的方式实现gateway的网关以及路由的配置
 */
@Configuration
public class GateWayConfig {

    /**
     * 案例：通过路由来访问百度新闻网站
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        // 创建route对象，来创建有几个路由地址
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        // 创建路由的地址，以及路由的映射
        routes.route("path_route_wang"
                ,r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                .build();


        return routes.build();
    }

    @Bean
    public RouteLocator customRouteLocator2(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_wang2",r -> r.path("/game").uri("http://www.4399.com")).build();
        return routes.build();
    }

}
