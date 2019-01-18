package cn.com.self.service;

import cn.com.self.entity.User;

import java.util.List;

public interface TestService {
    public List<User> findUserByName(User user);
}
