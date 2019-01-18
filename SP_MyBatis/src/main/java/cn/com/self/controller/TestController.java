package cn.com.self.controller;

import cn.com.self.entity.User;
import cn.com.self.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/user/findUser.action")
    private String findUser(User user, Model model){
        List<User> userList = testService.findUserByName(user);
        model.addAttribute("userList", userList);
        return "/test/test.jsp";
    }
}
