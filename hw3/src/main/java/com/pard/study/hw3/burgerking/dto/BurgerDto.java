package com.pard.study.hw3.burgerking.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BurgerDto {
    private String name;
    private String type;
    private Double price;
}
