package com.soft1851.study.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentMapperTest.java
 * @Description TODO
 * @createTime 2020年09月20日 10:38:00
 */
@SpringBootTest
class StudentMapperTest {
    @Resource
    private StudentMapper studentMapper;

    @Test
    public void test(){
        System.out.println(studentMapper.selectAll());
    }

}