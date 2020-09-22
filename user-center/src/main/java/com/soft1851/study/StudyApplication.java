package com.soft1851.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author nitaotao
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.soft1851.study.mapper"})
@MapperScan(basePackages = {"com.soft1851.study.mapper"})
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

}
