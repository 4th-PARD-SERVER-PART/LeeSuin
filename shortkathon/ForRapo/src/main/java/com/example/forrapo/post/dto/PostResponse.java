package com.example.forrapo.post.dto;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class PostResponse {
    @Getter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PostReadResponse{
        private Long postId;
        private String title;
        private Integer count;
        private String time;
        private String method;
        private String effect;
        private int likeCount;
        private boolean liked;
    }
}
