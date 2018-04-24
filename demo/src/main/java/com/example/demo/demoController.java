package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demoController {

    @Autowired
    private DemoServiceImpl demoRepositery;

    @RequestMapping("/test")
    @ResponseBody
    public String demoTest(){
        return demoRepositery.insert("aaaa");
    }
}