package com.example.demo.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
@RequestMapping("/sys")
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        System.out.println("ender Controller ...");
        return  "hello world....";
    }
}
