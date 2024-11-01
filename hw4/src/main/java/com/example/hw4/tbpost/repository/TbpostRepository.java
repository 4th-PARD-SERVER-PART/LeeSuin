package com.example.hw4.tbpost.repository;

import com.example.hw4.tbpost.entity.Tbpost;
import com.example.hw4.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TbpostRepository extends JpaRepository<Tbpost, Long> {
    List<Tbpost> findAllByUser(User user);
}
