package com.soft1851.study.service;

import com.soft1851.study.domain.dto.StudentDto;
import com.soft1851.study.domain.entity.Student;
import com.soft1851.study.mapper.StudentMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentService.java
 * @Description TODO
 * @createTime 2020年09月19日 21:26:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class StudentService {
    private final StudentMapper studentMapper;

    public StudentDto getStudentDto(int id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getPkStudentId());
        studentDto.setName(student.getName());
        studentDto.setAge(student.getAge());
        return studentDto;
    }
}
