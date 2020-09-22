package soft1851.service;

import soft1851.entity.StudentCourse;

import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName CourseStudentService.java
 * @Description TODO
 * @createTime 2020年09月16日 16:12:00
 */
public interface CourseStudentService {
    /**
     * 根据学生Id查询对应的课程
     * @param id
     * @return
     */
    List<StudentCourse> findCourseByUserId(int id);
}
