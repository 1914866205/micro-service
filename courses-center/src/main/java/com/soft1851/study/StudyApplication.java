package com.soft1851.study;

import org.python.core.PyFunction;
import org.python.util.PythonInterpreter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author nitaotao
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.soft1851.study.mapper"})
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }
    /**
     * 创建 RestTemplate 实例并通过 @Bean 注解注入到 Ioc 容器中
     *
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
