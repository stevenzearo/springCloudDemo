package steve.spring.cloud.service.user.impl;

import steve.spring.cloud.service.user.UserService;

/**
 * @Author steve
 * @Date 2019/8/5
 * @Time 11:16
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public String userTest(String name) {
        return "hello " + name + "you are using user service......";
    }
}
