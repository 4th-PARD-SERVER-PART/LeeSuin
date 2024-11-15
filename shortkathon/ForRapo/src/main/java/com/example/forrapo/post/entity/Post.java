package com.example.forrapo.post.entity;

import com.example.forrapo.like.entity.Like;
import com.example.forrapo.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer count;
    private String time;

    @Lob
    private String method;

    @Lob
    private String effect;


    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Like> likes = new ArrayList<>();

    public static Post from(String title, Integer count, String time, String method, String effect){
        return new Post(null, title, count, time, method, effect, new ArrayList<>());
    }
    public void update(String title, Integer count, String time, String method, String effect){
        this.title = title;
        this.count = count;
        this.time = time;
        this.method = method;
        this.effect = effect;
    }


}
