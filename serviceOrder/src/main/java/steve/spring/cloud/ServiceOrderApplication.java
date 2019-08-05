package steve.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
public class ServiceOrderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ServiceOrderApplication.class, args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
