package com.soft1851.study.mapper;

import com.soft1851.study.domain.entity.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentMapper.java
 * @Description TODO
 * @createTime 2020年09月19日 21:25:00
 */
@Component
public interface StudentMapper extends Mapper<Student> {
}
