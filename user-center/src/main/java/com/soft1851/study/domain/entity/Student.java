package com.soft1851.study.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2020年09月10日 08:07:00
 */
@Table(name = "t_student")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    /**
     * 学生序号
     */
    @Id
    @GeneratedValue(generator = "JDBC")//主键生成策略
    @Column(name = "pkStudentId")
    private Integer pkStudentId;

    /**
     * 学生姓名
     */
    @Column(name = "name")
    private String name;

    /**
     * 学生年龄     */
    @Column(name = "age")
    private Integer age;

}
