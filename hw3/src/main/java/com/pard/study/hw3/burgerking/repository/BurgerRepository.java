package com.pard.study.hw3.burgerking.repository;

import com.pard.study.hw3.burgerking.entity.Burger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BurgerRepository extends JpaRepository<Burger, Long> {
    List<Burger> findByType(String type);
    List<Burger> findAllByOrderByNameAsc();
    List<Burger> findAllByOrderByPriceAsc(); //가격이 적은 순서대로 리스트
}
