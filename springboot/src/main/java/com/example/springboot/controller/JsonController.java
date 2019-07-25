package com.example.springboot.controller;

import com.example.springboot.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class JsonController {
    @CrossOrigin//跨域
    @RequestMapping("/user")
    @ResponseBody
    public User use(User user1){
        user1.setPhone("123");
        user1.setEmail("123@163.com");
        return user1;
    }
}
