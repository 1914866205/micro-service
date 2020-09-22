package com.soft1851.study.service;

import com.soft1851.study.entity.Student;

import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentService.java
 * @Description TODO
 * @createTime 2020年09月10日 08:43:00
 */
public interface StudentService {
    /**
     * 添加学生
     * @param student
     * @return
     */
    String insertStudent(Student student);

    /**
     * 删除学生
     *
     * @param id
     * @return
     */
    String deleteStudent(Long id);


    /**
     * 更新学生信息
     *
     * @param student
     * @return
     */
    String updateStudent(Student student);

    /**
     * 查询所有学生
     * @return
     */
    List<Student> findAllStudent();

}
