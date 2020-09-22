package soft1851;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName Dao.java
 * @Description TODO
 * @createTime 2020年09月10日 08:06:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CourseDtoMain {
    public static void main(String[] args) {

        SpringApplication.run(CourseDtoMain.class, args);
    }

    /**
     * 创建 RestTemplate 实例并通过 @Bean 注解注入到 Ioc 容器中
     *
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
