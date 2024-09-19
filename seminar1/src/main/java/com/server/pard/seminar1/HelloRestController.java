package com.server.pard.seminar1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping("/helloRest")
    public String hello(){
        return "Hello, Rest World";
    }
}
