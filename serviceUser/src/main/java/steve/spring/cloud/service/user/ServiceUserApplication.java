package steve.spring.cloud.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ServiceUserApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServiceUserApplication.class, args);
        System.out.println("user service starting......");
    }

}
