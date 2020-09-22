package soft1851.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soft1851.entity.Course;
import soft1851.entity.StudentCourse;

import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentRepository.java
 * @Description TODO
 * @createTime 2020年09月16日 14:52:00
 */
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {

    List<StudentCourse> findStudentCoursesByStudentIdEquals(int id);
}
