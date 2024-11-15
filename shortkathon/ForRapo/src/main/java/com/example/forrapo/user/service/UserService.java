package com.example.forrapo.user.service;

import com.example.forrapo.like.repository.LikeRepository;
import com.example.forrapo.post.dto.PostResponse;
import com.example.forrapo.user.dto.UserRequest;
import com.example.forrapo.user.dto.UserResponse;
import com.example.forrapo.user.entity.User;
import com.example.forrapo.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final LikeRepository likeRepository;

    public UserResponse.ReadUser readUser(Long userId){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("찾으시는 User 정보: " + userId + "가 존재하지 않습니다."));

        List<Long> likedPostIds = likeRepository.findlikedPostIdsByUserId(userId);

        return UserResponse.ReadUser.from(user);
    }
    public void createUser(UserRequest.UserCreateRequest req){
        User u = new User(null, req.getName(), req.getUserId(), req.getPassword(), new ArrayList<>());
        userRepository.save(u);
    }
    public void deleteUser(Long userId){
        User user = userRepository.findById(userId).orElseThrow(IllegalAccessError::new);
        userRepository.delete(user);
    }
}
