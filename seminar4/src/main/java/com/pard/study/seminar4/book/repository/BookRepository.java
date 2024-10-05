package com.pard.study.seminar4.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pard.study.seminar4.book.entity.Book;


public interface BookRepository extends JpaRepository<Book, Long> {
}
