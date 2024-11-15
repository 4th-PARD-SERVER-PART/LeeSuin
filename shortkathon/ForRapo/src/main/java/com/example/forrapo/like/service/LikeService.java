package com.example.forrapo.like.service;

import com.example.forrapo.like.dto.LikeResponse;
import com.example.forrapo.like.entity.Like;
import com.example.forrapo.like.repository.LikeRepository;
import com.example.forrapo.post.entity.Post;
import com.example.forrapo.post.repository.PostRepository;
import com.example.forrapo.user.entity.User;
import com.example.forrapo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LikeService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;
    private final LikeRepository likeRepository;

    public LikeResponse toggleLike(Long userId, Long postId){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("User 정보를 찾을 수 없습니다."));
        Post post = postRepository.findById(postId)
                .orElseThrow(() -> new NoSuchElementException("Post 정보를 찾을 수 없습니다."));

        Optional<Like> likeOptional = likeRepository.findByUserAndPost(user, post);
        boolean liked;

        if(likeOptional.isPresent()){
            Like like = likeOptional.get();
            like.toggleLike();
            likeRepository.save(like);
            liked = like.isLiked();
        }else{
            Like newLike = new Like(user, post);
            likeRepository.save(newLike);
            liked = true;
        }
        int totalLikes = likeRepository.countByPost(post);

        return LikeResponse.builder()
                .postId(postId)
                .userId(userId)
                .liked(liked)
                .totalLikes(totalLikes)
                .build();
    }
}
