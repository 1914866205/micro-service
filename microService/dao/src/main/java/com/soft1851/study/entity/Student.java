package com.soft1851.study.entity;

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
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name="T_STUDENT")
public class Student {
    /**
     * 学生序号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pkStudentId;

    /**
     * 学生姓名
     */
    @Column(nullable = false, length = 32)
    private String studentName;

    /**
     * 学生年龄
     */
    @Column(nullable = false, length = 32)
    private int age;

}