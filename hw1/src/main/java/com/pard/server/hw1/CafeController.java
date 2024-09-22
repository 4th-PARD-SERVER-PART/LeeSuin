package com.pard.server.hw1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
    @RequestMapping("/cafe")
    public String cafe(){
        return "cafe.html";
    }
}
