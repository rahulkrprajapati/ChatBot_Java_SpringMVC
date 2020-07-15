package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String start() {
        return "index";
    }
    @RequestMapping("/botlogin")
    public String botlogin() {
        return "botlogin";
    }
    @RequestMapping("/signup")
    public String signup() {
        return "signup";
    }
    @RequestMapping("/chatbot")
    public String chatbot() {
        return "chatbot";
    }
    @RequestMapping("/admin")
    public String admin() {
    	return "admin";
    }
}
