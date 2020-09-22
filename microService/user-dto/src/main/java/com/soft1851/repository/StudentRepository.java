package com.soft1851.repository;

import com.soft1851.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentRepository.java
 * @Description TODO
 * @createTime 2020年09月16日 14:52:00
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
