package com.soft1851.provider.controller;

import com.soft1851.provider.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentController.java
 * @Description TODO
 * @createTime 2020年09月13日 16:11:00
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @GetMapping(value = "/one")
    public Student getOneStudent() {
        return new Student(21, "涛涛");
    }

    @GetMapping(value = "/list")
    public List<Student> getStudentList() {
        Student[] students = new Student[]{
                new Student(19, "19岁的涛涛"),
                new Student(20, "20岁的涛涛"),
                new Student(21, "21岁的涛涛"),
        };
        return Arrays.asList(students);
    }

    @GetMapping(value = "/findByAge/{age}")
    public Student findByAge(@PathVariable("age") long age) {
        if (age==20){
            return new Student(20, "20岁的涛涛");
        }
        return new Student(20, "查无此人");
    }

}
