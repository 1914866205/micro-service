package com.soft1851.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName EurekaMain.java
 * @Description Eureka启动类
 * @createTime 2020年09月09日 22:11:00
 */
@SpringBootApplication
@EnableEurekaServer//允许成为Eureka的服务端
public class EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }
}
