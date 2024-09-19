package com.server.pard.seminar1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class MethodController {
    @GetMapping("")
    public String getUsers(){
        return "Get User controller";
    }

    @PostMapping("")
    public String addUsers(){
        return "add user to db";
    }
    @GetMapping("/{userId}")
    public String getUserById(@PathVariable Long userId){
        return userId + "빈 유저 정보 불러오기";
    }

    @PatchMapping("/{userId}")
    public String patchUserById(@PathVariable Long userId){
        return userId + " 빈 유저정보 수정";
    }

    @DeleteMapping("/{userId}")
    public String deleteById(@PathVariable Long userId){
        return userId + "빈 유저 삭제";
    }
}
