package com.pard.study.hw3.burgerking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Burger {
    @Id
    @GeneratedValue
    private Long burgerId;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = "type",  nullable = false)
    private String type;

    @Column(name = "price", nullable = false)
    private Double price;

    @CreationTimestamp
    private LocalDateTime payTime;
}
