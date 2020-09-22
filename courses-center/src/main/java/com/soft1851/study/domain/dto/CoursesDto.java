package com.soft1851.study.domain.dto;

import com.soft1851.study.domain.entity.Courses;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName CoursesDto.java
 * @Description TODO
 * @createTime 2020年09月19日 22:08:00
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoursesDto {
    private Courses courses;
    private String name;

}
