package com.example.forrapo.post.dto;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class PostRequest {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostCreateRequest{
        private String title;
        private Integer count;
        private String time;
        private String method;
        private String effect;
    }
}
