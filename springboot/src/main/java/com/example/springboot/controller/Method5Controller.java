package com.example.springboot.controller;

import com.example.springboot.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
//返回值的5种方式
@Controller
public class Method5Controller {
    @GetMapping("/single")
    @ResponseBody
    public String single(){
        return "single";
    }

    @GetMapping("path/{id}")
    @ResponseBody
    public String path(long id){
        return "path";
    }

    @GetMapping("/object")
    @ResponseBody
    public User object(User user){
        User user1=new User();
        user1.setName("tom");
        user1.setAge(6);
        return user1;
    }

    @GetMapping("/map")
    @ResponseBody
    public String map(Map map){
        return "map";
    }

    @GetMapping("/req")
    @ResponseBody
    public HttpServletRequest req(HttpServletRequest servletRequest){
        servletRequest.setAttribute("aaa","aa");
        return servletRequest;
    }
}
