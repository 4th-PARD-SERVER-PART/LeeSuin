package com.pard.study.hw3.bugerking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BugerDto {
    private String name;
    private String type;
    private Double price;
}
