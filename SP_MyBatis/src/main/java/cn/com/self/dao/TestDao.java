package cn.com.self.dao;

import cn.com.self.entity.User;
import java.util.List;

public interface TestDao {
    public List<User> findUserByName(User user);
}
