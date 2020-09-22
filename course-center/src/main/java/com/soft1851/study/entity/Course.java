package com.soft1851.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Course.java
 * @Description TODO
 * @createTime 2020年09月18日 10:21:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private String name;
    private String teacher;
}
