package com.hsf.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 2020.0.X版本开始的OpenFeign底层不再使用Ribbon
 * 所以要引入spring-cloud-starter-loadbalancer
 * 并将ribbon移除
 */
@SpringBootApplication
@EnableFeignClients
public class NacosConsumer7600 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer7600.class, args);
    }

}
