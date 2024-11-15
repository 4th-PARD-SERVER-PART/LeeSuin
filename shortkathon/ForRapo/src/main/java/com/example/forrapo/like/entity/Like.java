package com.example.forrapo.like.entity;

import com.example.forrapo.post.entity.Post;
import com.example.forrapo.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "post_like")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "likeId")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "postId")
    private Post post;

    private boolean liked;

    public Like(User user, Post post){
        this.user = user;
        this.post = post;
        this.liked = true;
    }

    public void toggleLike(){
        this.liked = !this.liked;
    }
//    public void setPost(Post post){
//        this.post = post;
//    }

}
