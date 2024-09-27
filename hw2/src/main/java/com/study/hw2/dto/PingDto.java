package com.study.hw2.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PingDto {
    private Long pingId;
    private String pingName;
    private String color;
}
