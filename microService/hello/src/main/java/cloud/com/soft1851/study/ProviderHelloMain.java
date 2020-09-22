package cloud.com.soft1851.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 倪涛涛
 * @version 1.0.0
 * @ClassName ProviderHellloMain.java
 * @Description TODO
 * @createTime 2020年09月09日 22:47:00
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableEurekaClient
public class ProviderHelloMain {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHelloMain.class, args);
    }
}
