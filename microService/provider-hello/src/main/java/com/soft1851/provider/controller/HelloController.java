package com.soft1851.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2020年09月13日 16:08:00
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @GetMapping
    public String getHello(){
        return "hello world";
    }
}
