package com.example.forrapo.like.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LikeResponse {
    private Long postId;
    private Long userId;
    private boolean liked;
    private int totalLikes;
}
