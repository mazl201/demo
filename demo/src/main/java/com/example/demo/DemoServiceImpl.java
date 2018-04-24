package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl {
    @Autowired
    private DemoRepositery demoRepositery;

    public String insert(String name){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        demoRepositery.save(userInfo);
        return "111";
    }
}
