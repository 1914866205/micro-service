package com.soft1851.study.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentDto.java
 * @Description TODO
 * @createTime 2020年09月19日 21:24:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private Integer id;
    private String name;
    private int age;
}
