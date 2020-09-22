package soft1851.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import soft1851.entity.Course;
import soft1851.entity.Student;
import soft1851.entity.StudentCourse;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentHanler.java
 * @Description TODO
 * @createTime 2020年09月13日 16:29:00
 */

@RequestMapping()
@RestController
public class StudentHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/findCoursesByStudentId/{id}")
    public Map getCoursesByStudentId(@PathVariable int id){
        Map map = new HashMap();
        Map data = new HashMap();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", data);
        /**
         * 根据学生id查询学生信息
         * 根据学生id查询课表
         * 根据课表id查询课程名称
         */
        Student student = restTemplate.getForObject("http://ntt.com:8006/student/find/" + id, Student.class);
        System.out.println("*********根据学生id查询学生信息**********");
        System.out.println(student);
        System.out.println("***************************************");

        data.put("name", student.getName());
        data.put("age", student.getAge());

        StudentCourse[] studentCourses = restTemplate.getForObject("http://ntt.com:8007/studentCourse/findStudentCoursesById/" + student.getPkStudentId(), StudentCourse[].class);
        System.out.println("*********根据学生id查询选课信息**********");
        System.out.println(studentCourses);
        System.out.println("***************************************");
        List courses = new ArrayList();
        for (StudentCourse studentCourse : studentCourses) {
            Course course = restTemplate.getForObject("http://ntt.com:8007/course/findCoursesById/" + studentCourse.getCourseId(), Course.class);
            courses.add(course.getCourseName());
        }
        data.put("courses", courses);
        return map;
    }
}
