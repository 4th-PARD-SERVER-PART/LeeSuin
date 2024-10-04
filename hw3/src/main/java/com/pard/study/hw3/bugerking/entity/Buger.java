package com.pard.study.hw3.bugerking.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Buger {
    @Id
    @GeneratedValue
    private Long bugerId;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = "type",  nullable = false)
    private String type;

    @Column(name = "price", nullable = false)
    private Double price;

    @CreationTimestamp
    private LocalDateTime payTime;
}
