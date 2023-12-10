// src/main/java/com/example/demo/service/ComicService.java
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comic;
import com.example.demo.repository.ComicRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComicService {
    @Autowired
    private ComicRepository comicRepository;

    public List<Comic> getAllComics() {
        return ComicRepository.findAll();
    }

    public Optional<Comic> getComicById(Long id) {
        return comicRepository.findById(id);
    }

    public Comic createComic(Comic comic) {
        return comicRepository.save(comic);
    }

    public Comic updateComic(Long id, Comic updatedComic) {
        // Implementar lógica de actualización
        return null;
    }

    public void deleteComic(Long id) {
        comicRepository.deleteById(id);
    }
}
