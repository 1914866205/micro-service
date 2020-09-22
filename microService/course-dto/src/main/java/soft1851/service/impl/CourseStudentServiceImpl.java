package soft1851.service.impl;

import org.springframework.stereotype.Service;
import soft1851.entity.StudentCourse;
import soft1851.repository.StudentCourseRepository;
import soft1851.service.CourseStudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName CourseStudentServiceImpl.java
 * @Description TODO
 * @createTime 2020年09月16日 16:13:00
 */
@Service
public class CourseStudentServiceImpl implements CourseStudentService {

    @Resource
    private StudentCourseRepository studentCourseRepository;
    @Override
    public List<StudentCourse> findCourseByUserId(int id) {
        return studentCourseRepository.findStudentCoursesByStudentIdEquals(id);
    }
}
