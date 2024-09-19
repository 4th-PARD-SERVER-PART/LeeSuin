package com.server.pard.seminar1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class RequestParamController {
    @RequestMapping("/v1")
    public String param1(@RequestParam("name") String myName, @RequestParam("age") int myAge){
        return "Request Param 1 name: " + myName + " age : " + myAge;
    }
    @RequestMapping("/v2")
    public String param2(@RequestParam String name, @RequestParam int age){
        return "Request param 2 name : " + name + " age : " + age;
    }
    @RequestMapping("/v3")
    public String param3(String name, Integer age){
        //Integer => null값을 허용
        return "Requet param 3 name: " + name + " age: " + age;
    }
    @RequestMapping("/v4")
    public String param4(@RequestParam String name, @RequestParam(required=false) Integer age){
        if(age == null){
            return "Request param 4 : " + name + " age " + "제공되지 않음";
        }
        return "Request param 4 : " + name + " age : " + age;
    }

    @RequestMapping("/v5")
    public String param5(@RequestParam(defaultValue = "파드") String name,
                         @RequestParam(required = false, defaultValue = "-2")Integer age){
        return "Request param 5 : " + name + " 나이 : " + age;
    }

    @RequestMapping("/v6")
    public String param6(@RequestParam Map<String, Objects> map){
        return "Request param 6번 : " + map.get("name") + map.get("age");
    }
}
