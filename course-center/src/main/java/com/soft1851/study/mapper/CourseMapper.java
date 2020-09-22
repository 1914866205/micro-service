package com.soft1851.study.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.study.entity.Course;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName CourseMapper.java
 * @Description TODO
 * @createTime 2020年09月18日 10:33:00
 */
public interface CourseMapper extends BaseMapper<Course> {
    /**
     * 根据id查课程
     * @param id
     * @return
     */
    Course getCourseById(Integer id);
}
