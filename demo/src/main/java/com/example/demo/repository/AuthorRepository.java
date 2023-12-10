// src/main/java/com/example/demo/repository/AuthorRepository.java
package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    void deleteById(Long id);

    Author save(Author author);

    Optional<Author> findById(Long id);

    List<Author> findAll();
}
