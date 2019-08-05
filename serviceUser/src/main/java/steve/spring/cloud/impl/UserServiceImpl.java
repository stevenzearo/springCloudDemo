package steve.spring.cloud.impl;

import org.springframework.stereotype.Service;
import steve.spring.cloud.UserService;

/**
 * @Author steve
 * @Date 2019/8/5
 * @Time 11:16
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String userTest(String name) {
        return "hello " + name + " you are using user service......";
    }
}
