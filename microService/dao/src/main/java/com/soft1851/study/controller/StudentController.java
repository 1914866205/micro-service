package com.soft1851.study.controller;

import com.soft1851.study.entity.Student;
import com.soft1851.study.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentController.java
 * @Description TODO
 * @createTime 2020年09月10日 08:26:00
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @GetMapping("/findAll")
    public List<Student> findAll() {
        return studentService.findAllStudent();
    }

    @PostMapping("/delete")
    public String deleteById(Long id) {
        return studentService.deleteStudent(id);
    }

    @PostMapping("/update")
    public String update(Student student) {
        return studentService.updateStudent(student);
    }

    @PostMapping("/increase")
    public String increase(Student student) {
        return studentService.insertStudent(student);
    }

}
