package com.soft1851.study.controller;

import com.soft1851.study.domain.dto.StudentDto;
import com.soft1851.study.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentController.java
 * @Description TODO
 * @createTime 2020年09月19日 21:30:00
 */
@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class StudentController {
    private final StudentService studentService;

    @GetMapping(value = "/{id}")
    public StudentDto getStudentDto(@PathVariable int id) {
        return studentService.getStudentDto(id);
    }

    @GetMapping(value = "/test")
    public String test() {
        return "111";
    }
}
