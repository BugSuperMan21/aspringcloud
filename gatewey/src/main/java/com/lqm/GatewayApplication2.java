package com.lqm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy //：包含了了 @EnableZuulServer ，设置该类是⽹网关的启动类。
@EnableAutoConfiguration //可以帮助 Spring Boot 应⽤用将所有符合条件的 @Configuration 配置加载到当前 Spring Boot 创建并使⽤用的 IoC 容器器中。
public class GatewayApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
