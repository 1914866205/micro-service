package com.soft1851.repository;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentRepositoryTest.java
 * @Description TODO
 * @createTime 2020年09月16日 14:55:00
 */
@SpringBootTest
public class StudentRepositoryTest {

    @Resource
    private StudentRepository studentRepository;

    @Test
    public void test(){
        System.out.println(studentRepository.findById(1));
    }
}