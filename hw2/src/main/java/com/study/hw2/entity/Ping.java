package com.study.hw2.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ping {
    private Long pingId;
    private String pingName;
    private String color;
}
