package com.example.forrapo.like.repository;

import com.example.forrapo.like.entity.Like;
import com.example.forrapo.post.entity.Post;
import com.example.forrapo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByUserAndPost(User user, Post post);

    int countByPost(Post post);

    boolean existsByUserAndPost(User user, Post post);

    @Query("SELECT l.post.id FROM Like l WHERE l.user.id = :userId")
    List<Long> findlikedPostIdsByUserId(@Param("userId") Long userId);
}
