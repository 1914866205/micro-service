package consumer.handler;

import consumer.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName StudentHanler.java
 * @Description TODO
 * @createTime 2020年09月13日 16:29:00
 */

@RequestMapping("/consumer")
@RestController
public class StudentHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/student/one")
    public Student getOneStudent(){
        return restTemplate.getForObject("http://ntt.com:8001/student/one", Student.class);
    }

    @GetMapping("/student/list")
    public List<Student> getStudentList() {
        return restTemplate.getForObject("http://ntt.com:8001/student/list", List.class);
    }
}
