package com.example.bookmicroservice.repository;

import com.example.bookmicroservice.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
