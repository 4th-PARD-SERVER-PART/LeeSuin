package com.example.seminar5.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//login.html을 만들어짐
@Controller
public class LoginController {
   @GetMapping("/loginForm")
    public String login(){
       return "loginForm";
   }

}
