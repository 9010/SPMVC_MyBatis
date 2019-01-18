package cn.com.self.service.impl;

import cn.com.self.dao.TestDao;
import cn.com.self.entity.User;
import cn.com.self.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    public List<User> findUserByName(User user){
        return testDao.findUserByName(user);
    }
}
