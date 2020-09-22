package com.soft1851.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName com.soft1851.provider.ProviderHello.java
 * @Description TODO
 * @createTime 2020年09月13日 15:38:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderHello {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHello.class,args);
    }
}
