package com.example.hw4.tblike.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TblikeRequest {
    private Long userId;
    private Long tbpostId;
}
