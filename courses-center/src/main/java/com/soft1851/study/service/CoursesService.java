package com.soft1851.study.service;

import com.soft1851.study.mapper.CoursesMapper;
import com.soft1851.study.domain.entity.Courses;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentService.java
 * @Description TODO
 * @createTime 2020年09月19日 21:26:00
 */
@Service
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class CoursesService {
    private final CoursesMapper coursesMapper;
    public List<Courses> findAll(){
        return coursesMapper.selectAll();
    }
}
