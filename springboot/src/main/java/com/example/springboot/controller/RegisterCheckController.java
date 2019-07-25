package com.example.springboot.controller;

import com.example.springboot.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
public class RegisterCheckController {
    @GetMapping("/reg")
    @ResponseBody
    public String us(@Validated User user1, BindingResult result){
        StringBuffer stringBuffer = new StringBuffer();
        if(result.hasErrors()){
            List<FieldError> list =result.getFieldErrors();
            for (FieldError objectError:list) {
                stringBuffer.append(objectError.getDefaultMessage());
                stringBuffer.append("---");
            }
        }
        return stringBuffer!=null?stringBuffer.toString():"";
    }
}
