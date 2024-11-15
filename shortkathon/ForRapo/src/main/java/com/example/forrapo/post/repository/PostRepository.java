package com.example.forrapo.post.repository;

import com.example.forrapo.post.entity.Post;
import com.example.forrapo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface PostRepository extends JpaRepository<Post, Long> {
}
