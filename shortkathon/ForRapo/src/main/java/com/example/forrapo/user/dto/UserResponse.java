package com.example.forrapo.user.dto;

import com.example.forrapo.post.dto.PostResponse;
import com.example.forrapo.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class UserResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ReadUser{
        private String name;
        private String userId;
        private String password;

        public static ReadUser from(User user){
            return new ReadUser(user.getName(),user.getUserId(), user.getPassword());
        }
    }
}
