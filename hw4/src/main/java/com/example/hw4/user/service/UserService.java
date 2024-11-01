package com.example.hw4.user.service;

import com.example.hw4.tblike.repository.TblikeRepository;
import com.example.hw4.tbpost.dto.TbpostResponse;
import com.example.hw4.tbpost.entity.Tbpost;
import com.example.hw4.user.dto.UserRequest;
import com.example.hw4.user.dto.UserResponse;
import com.example.hw4.user.entity.User;
import com.example.hw4.user.repository.UserRepository;
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
    private final TblikeRepository tblikeRepository;
    public UserResponse.ReadUser readUser(Long userId){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new NoSuchElementException("찾으시는 User 정보: " + userId + "가 존재하지 않습니다."));

        List<Long> likedPostIds = tblikeRepository.findlikedPostIdsByUserId(userId);

        List<TbpostResponse.TbpostReadResponse> tbposts = user.getTbpost().stream()
                .map(tbpost -> {
                    int likeCount = tblikeRepository.countByTbpost(tbpost);
                    boolean likedByCurrentUser = likedPostIds.contains(tbpost.getId());
                    return new TbpostResponse.TbpostReadResponse(
                            tbpost.getId(),
                            tbpost.getTitle(),
                            tbpost.getContent(),
                            likeCount,
                            likedByCurrentUser
                    );
                })
                .collect(Collectors.toList());

        return UserResponse.ReadUser.from(user, tbposts);
    }
    public void createUser(UserRequest.UserCreateRequest req){
        User u = new User(null, req.getName(), null, new ArrayList<>());
        userRepository.save(u);
    }
    public UserResponse.ReadUser updateUser(Long userId, UserRequest.UserCreateRequest req){
        Optional<User> u = userRepository.findById(userId);
        User user = u.get();
        user.update(req.getName());
        userRepository.save(user);
        return readUser(userId);
    }
    public void deleteUser(Long userId){
        User user = userRepository.findById(userId).orElseThrow(IllegalAccessError::new);
        userRepository.delete(user);
    }
}
