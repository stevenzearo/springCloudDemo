package steve.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author steve
 * @Date 2019/8/5
 * @Time 15:00
 * @Version 1.0
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/test/{name}")
    public String orderTest(@PathVariable("name") String name) {

        String s = restTemplate.getForObject("http://localhost:8762/user/test/" + name, String.class);

        return s + "\nhello " + name + " you are using order service......";
    }
}
