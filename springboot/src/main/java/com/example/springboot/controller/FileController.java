package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
@CrossOrigin
public class FileController {
    //先通过http://localhost:8080/up进入上传文件的界面
    @GetMapping("/up")
    public String helloworld(){
        return "upload";
    }

    @Value("${web.upload-path}")
    //在properties文件中定义好上传路径
    private String path;

    //向后台请求上传文件
    @RequestMapping("fileupload")
    public String fileupload( MultipartFile upload) throws Exception{
        File file = new File(path);
        if(!file.exists()){
            file.mkdirs();
        }
        //获取文件名称
        String filename = upload.getOriginalFilename();
        //将文件进行上传
        upload.transferTo( new File(path,filename));
        //返回上传成功界面
        return "success";
    }
}
