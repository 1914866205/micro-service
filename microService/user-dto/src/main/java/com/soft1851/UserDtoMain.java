package com.soft1851;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Dao.java
 * @Description TODO
 * @createTime 2020年09月10日 08:06:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserDtoMain {
    public static void main(String[] args) {
        SpringApplication.run(UserDtoMain.class, args);
    }
}
