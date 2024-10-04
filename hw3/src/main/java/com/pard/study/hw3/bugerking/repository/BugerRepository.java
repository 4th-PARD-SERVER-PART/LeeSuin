package com.pard.study.hw3.bugerking.repository;

import com.pard.study.hw3.bugerking.entity.Buger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BugerRepository extends JpaRepository<Buger, Long> {
}
