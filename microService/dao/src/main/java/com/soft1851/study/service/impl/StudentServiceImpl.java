package com.soft1851.study.service.impl;

import com.soft1851.study.entity.Student;
import com.soft1851.study.repository.StudentRepository;
import com.soft1851.study.service.StudentService;
import lombok.val;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentServiceImpl.java
 * @Description TODO
 * @createTime 2020年09月10日 08:43:00
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;

    @Override
    public String insertStudent(Student student) {
        studentRepository.save(student);
        return "添加成功";
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "删除成功";
    }

    @Override
    public String updateStudent(Student student) {
        Optional<Student> studentById = studentRepository.findById(student.getPkStudentId());
        Student student1 = studentById.get();
        student1.setStudentName(student.getStudentName());
        student1.setAge(student.getAge());
        studentRepository.save(student1);
        return "修改成功";
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }
}
