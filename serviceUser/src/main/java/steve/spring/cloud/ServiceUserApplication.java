package steve.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class ServiceUserApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServiceUserApplication.class, args);
        System.out.println("user service starting......");
    }

}
