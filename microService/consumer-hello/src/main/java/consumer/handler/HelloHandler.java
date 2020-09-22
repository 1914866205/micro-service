package consumer.handler;

import consumer.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Handler.java
 * @Description TODO
 * @createTime 2020年09月13日 15:54:00
 */
@RequestMapping("/consumer")
@RestController
public class HelloHandler {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String getHello(){
        //通过restTemplate来调用provider提供的服务
        return restTemplate.getForObject("http://ntt.com:8001/hello", String.class);
    }

    @GetMapping("/findByAge/{age}")
    public Student findByAge(@PathVariable("age") long age) {
        return restTemplate.getForObject("http://ntt.com:8001/student/findByAge/{age}", Student.class, age);
    }

}
