package com.pard.study.seminar3.user.repository;

import com.pard.study.seminar3.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String email);

}
