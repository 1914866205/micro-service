package consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName com.soft1851.provider.ConsumerHello.java
 * @Description TODO
 * @createTime 2020年09月13日 15:38:00
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerHello {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHello.class,args);
    }

    /**
     * 创建 RestTemplate 实例并通过 @Bean 注解注入到 Ioc 容器中
     * @return RestTemplate
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
