package soft1851.service;

import soft1851.entity.Course;

import java.util.Optional;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentService.java
 * @Description TODO
 * @createTime 2020年09月16日 14:49:00
 */
public interface CourseService {
    /**
     * 根据课程id查询课程信息
     * @param id
     * @return
     */
    Optional<Course> findById(int id);
}
