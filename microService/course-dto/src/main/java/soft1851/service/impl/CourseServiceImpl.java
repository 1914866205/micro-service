package soft1851.service.impl;

import org.springframework.stereotype.Service;
import soft1851.entity.Course;
import soft1851.repository.CourseRepository;
import soft1851.service.CourseService;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentServiceImpl.java
 * @Description TODO
 * @createTime 2020年09月16日 14:50:00
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseRepository courseRepository;

    @Override
    public Optional<Course> findById(int id) {
        return courseRepository.findById(id);
    }
}
