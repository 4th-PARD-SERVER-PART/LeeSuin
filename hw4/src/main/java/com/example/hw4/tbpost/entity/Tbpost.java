package com.example.hw4.tbpost.entity;

import com.example.hw4.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Tbpost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Lob private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public static Tbpost from(String title, String content, User user){
        return new Tbpost(null, title, content, user);
    }
}
