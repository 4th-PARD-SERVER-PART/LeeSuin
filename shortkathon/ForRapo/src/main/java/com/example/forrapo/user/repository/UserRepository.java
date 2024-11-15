package com.example.forrapo.user.repository;

import com.example.forrapo.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
