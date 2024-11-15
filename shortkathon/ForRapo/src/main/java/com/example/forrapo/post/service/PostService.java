package com.example.forrapo.post.service;

import com.example.forrapo.like.dto.LikeResponse;
import com.example.forrapo.like.repository.LikeRepository;
import com.example.forrapo.like.service.LikeService;
import com.example.forrapo.post.dto.PostRequest;
import com.example.forrapo.post.dto.PostResponse;
import com.example.forrapo.post.entity.Post;
import com.example.forrapo.post.repository.PostRepository;
import com.example.forrapo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final LikeRepository likeRepository;

    public void createPost(PostRequest.PostCreateRequest req){
        Post post = Post.from(req.getTitle(),req.getCount(), req.getTime(), req.getMethod(), req.getEffect());
        postRepository.save(post);
    }
    public void delete(Long postId){
        Post post = postRepository.findById(postId).orElseThrow(IllegalAccessError::new);
        postRepository.delete(post);
    }

    // 모든 게시물 조회
    public List<PostResponse.PostReadResponse> getAllPosts() {
        return postRepository.findAll().stream()
                .map(this::convertToPostReadResponse) // userId 없이 좋아요 수만 포함
                .collect(Collectors.toList());
    }

    private PostResponse.PostReadResponse convertToPostReadResponse(Post post) {
        int likeCount = likeRepository.countByPost(post); // 해당 게시물의 좋아요 수

        return PostResponse.PostReadResponse.builder()
                .postId(post.getId())
                .title(post.getTitle())
                .count(post.getCount())
                .time(post.getTime())
                .method(post.getMethod())
                .effect(post.getEffect())
                .likeCount(likeCount)
                .liked(false) // userId로 조회하지 않으므로 기본값으로 false 설정
                .build();
    }
}
