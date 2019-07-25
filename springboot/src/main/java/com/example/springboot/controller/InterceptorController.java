package com.example.springboot.controller;

import com.example.springboot.po.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;

@Controller
@CrossOrigin
public class InterceptorController {
    @RequestMapping("/interceptor")
    @ResponseBody
    public String index(){
        return "登录成功";
    }

}
