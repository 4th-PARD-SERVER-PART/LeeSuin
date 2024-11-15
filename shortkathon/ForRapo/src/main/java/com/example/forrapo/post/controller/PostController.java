package com.example.forrapo.post.controller;

import com.example.forrapo.like.dto.LikeResponse;
import com.example.forrapo.like.service.LikeService;
import com.example.forrapo.post.dto.PostRequest;
import com.example.forrapo.post.dto.PostResponse;
import com.example.forrapo.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {
    private final PostService postService;
    private final LikeService likeService;

    @PostMapping("")
    public void createPost(@RequestBody PostRequest.PostCreateRequest req){
        postService.createPost(req);
    }

    @GetMapping("/getAll")
    public List<PostResponse.PostReadResponse> getAllPosts() {
        return postService.getAllPosts();
    }
    @DeleteMapping("/{postId}")
    public void deletePost(@PathVariable Long postId){
        postService.delete(postId);
    }

    @PostMapping("/{tbpostId}/like/{userId}")
    public LikeResponse toggleLike(@PathVariable Long postId, @PathVariable Long userId) {
        return likeService.toggleLike(userId, postId); // 좋아요 토글 기능 호출
    }
}
