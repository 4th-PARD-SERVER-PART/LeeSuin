package com.pard.study.seminar3.user.service;

import com.pard.study.seminar3.user.dto.UserDto;
import com.pard.study.seminar3.user.entity.User;
import com.pard.study.seminar3.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void save(UserDto userDto){
        User user = User.builder()
                        .email(userDto.getEmail())
                        .password(userDto.getPassword())
                        .build();
        userRepository.save(user);
    }
    public UserDto read(Long userId){
        User user = userRepository.findById(userId).get();
        return UserDto.builder()
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }

    public List<UserDto> readAll(){
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = users.stream().map(user ->
                UserDto.builder()
                        .email(user.getEmail())
                        .password(user.getPassword())
                        .build()).toList();
        return userDtos;
    }

    //@Transactional을 사용할 경우 save를 따로 쓰지 않아도 괜찮음 spring transactional
    public void update(Long userId, UserDto userDto){
        User user = userRepository.findById(userId).get();
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
    }

    public Long getUserNum(String email){
        User user = userRepository.findByEmail(email);
        return user.getUserId();
    }
    public void delete(Long userId){
        userRepository.deleteById(userId);
    }
}
