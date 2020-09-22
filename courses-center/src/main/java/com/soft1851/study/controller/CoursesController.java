package com.soft1851.study.controller;

import com.soft1851.study.domain.dto.CoursesDto;
import com.soft1851.study.domain.dto.StudentDto;
import com.soft1851.study.domain.entity.Courses;
import com.soft1851.study.service.CoursesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentController.java
 * @Description TODO
 * @createTime 2020年09月19日 21:30:00
 */
@RestController
@RequestMapping(value = "/courses")
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class CoursesController {
    private final CoursesService coursesService;
    private final RestTemplate restTemplate;
    @GetMapping("/all")
    public List<CoursesDto> getAll() {
        List<Courses> courses = coursesService.findAll();
        List<CoursesDto> coursesList = new ArrayList<>();
        courses.forEach(course -> {
            int studentId = course.getStudentId();
            StudentDto studentDto = restTemplate.getForObject("http://120.26.177.51:8081/student/{id}", StudentDto.class, studentId);
            assert studentDto != null;
            CoursesDto coursesDto = CoursesDto.builder().courses(course).name(studentDto.getName()).build();
            coursesList.add(coursesDto);
        });
        return coursesList;
    }

    @GetMapping("/helloPython")
    public String helloPython() {
            return restTemplate.getForObject("http://127.0.0.1:5001/python",String.class);
    }
}
