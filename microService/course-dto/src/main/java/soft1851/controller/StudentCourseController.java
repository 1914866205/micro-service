package soft1851.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soft1851.entity.StudentCourse;
import soft1851.service.CourseStudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName CourseController.java
 * @Description TODO
 * @createTime 2020年09月16日 16:21:00
 */
@RestController
@RequestMapping("/studentCourse")
public class StudentCourseController {
    @Resource
    private CourseStudentService courseStudentService;

    /**
     * 根据用户id查询相应课程
     * @param id
     * @return
     */
    @GetMapping("/findStudentCoursesById/{id}")
    public List<StudentCourse> findStudentCoursesById(@PathVariable int id) {
        return courseStudentService.findCourseByUserId(id);
    }
}
