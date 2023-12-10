// src/main/java/com/example/demo/repository/ComicRepository.java
package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Comic;

public interface ComicRepository<Comic> extends JpaRepository<Comic, Long> {

    static <Comic> List<Comic> findAll() {
        return null;
    }

    Optional<Comic> findById(Long id);

    com.example.demo.entity.Comic save(com.example.demo.entity.Comic comic);

    void deleteById(Long id);
}

