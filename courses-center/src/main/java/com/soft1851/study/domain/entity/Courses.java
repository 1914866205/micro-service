package com.soft1851.study.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Courses.java
 * @Description TODO
 * @createTime 2020年09月19日 22:08:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_courses")
public class Courses {
    @Id
    @GeneratedValue(generator = "JDBC")//主键生成策略
    @Column(name = "pkCoursesId")
    private Integer pkCoursesId;

    @Column(name = "name")
    private String name;

    @Column(name = "studentId")
    private Integer studentId;
}
