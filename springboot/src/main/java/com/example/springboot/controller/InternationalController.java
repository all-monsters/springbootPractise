package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InternationalController {
    @RequestMapping("/inter")
    public String inter(){
        return "international";
    }
}
