package lxm.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    public String getUserName(Integer userId) {
        return userId + " hello world";
    }
}
