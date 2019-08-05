package steve.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import steve.spring.cloud.UserService;

/**
 * @Author steve
 * @Date 2019/8/5
 * @Time 14:51
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return userService.userTest(name);
    }
}
