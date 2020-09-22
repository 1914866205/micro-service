package com.soft1851.study.repository;

import com.soft1851.study.entity.Student;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentRepository.java
 * @Description TODO
 * @createTime 2020年09月10日 08:29:00
 */
public interface StudentRepository extends JpaRepository<Student,Long> {
}
