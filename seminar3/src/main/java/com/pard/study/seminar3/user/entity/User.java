package com.pard.study.seminar3.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "password")
    private String password;

    @CreationTimestamp
    private Timestamp userSignupTime;
}
