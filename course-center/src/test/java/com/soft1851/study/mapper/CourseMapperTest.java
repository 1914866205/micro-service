package com.soft1851.study.mapper;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName CourseMapperTest.java
 * @Description TODO
 * @createTime 2020年09月18日 10:52:00
 */
@SpringBootTest
class CourseMapperTest {
    @Resource
    private CourseMapper courseMapper;
    @Test
    void getCourseById() {
        System.out.println(courseMapper.getCourseById(1));
    }
}