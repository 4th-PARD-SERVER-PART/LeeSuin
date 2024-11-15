package com.example.forrapo.like.controller;

import com.example.forrapo.like.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/like")
public class LikeController {
    private final LikeService likeService;

    @PostMapping("/{userId}/{postId}")
    public void toggleLike(@PathVariable Long user_id, @PathVariable Long postId){
        likeService.toggleLike(user_id, postId);
    }
}
