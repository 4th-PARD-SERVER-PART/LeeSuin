package com.example.hw4.tblike.repository;

import com.example.hw4.tblike.entity.Tblike;
import com.example.hw4.tbpost.entity.Tbpost;
import com.example.hw4.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TblikeRepository extends JpaRepository<Tblike, Long> {
    Optional<Tblike> findByUserAndTbpost(User user, Tbpost tbpost);
    int countByTbpost(Tbpost tbpost);

    boolean existsByUserAndTbpost(User user, Tbpost tbpost);

    @Query("SELECT l.tbpost.id FROM Tblike l WHERE l.user.id = :userId")
    List<Long> findlikedPostIdsByUserId(@Param("userId") Long userId);

}
