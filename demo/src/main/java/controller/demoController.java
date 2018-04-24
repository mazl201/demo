package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class demoController {
    @RequestMapping("/test")
    @ResponseBody
    public String demoTest(){
        return "hello world";
    }
}
