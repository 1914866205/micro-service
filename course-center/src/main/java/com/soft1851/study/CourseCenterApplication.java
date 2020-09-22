package com.soft1851.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nitaotao
 */
@SpringBootApplication
@MapperScan("com.soft1851.study.mapper")
public class CourseCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseCenterApplication.class, args);
    }
}
