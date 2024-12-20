package com.example.forrapo.user.controller;

import com.example.forrapo.user.dto.UserRequest;
import com.example.forrapo.user.dto.UserResponse;
import com.example.forrapo.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    @GetMapping("/{userId}")
    public UserResponse.ReadUser getUser(@PathVariable Long userId){
        return userService.readUser(userId);
    }
    @PostMapping("")
    public void createUser(@RequestBody UserRequest.UserCreateRequest req){
        userService.createUser(req);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
        userService.deleteUser(userId);
    }
}
