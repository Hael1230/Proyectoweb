// src/main/java/com/example/demo/controller/ComicController.java
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comics")
public class ComicController {
    @Autowired
    private ComicService comicService;

    @GetMapping
    public List<Comic> getAllComics() {
        return comicService.getAllComics();
    }

    @GetMapping("/{id}")
    public Optional<Comic> getComicById(@PathVariable Long id) {
        return comicService.getComicById(id);
    }

    @PostMapping
    public Comic createComic(@RequestBody Comic comic) {
        return comicService.createComic(comic);
    }

    @PutMapping("/{id}")
    public Comic updateComic(@PathVariable Long id, @RequestBody Comic updatedComic) {
        return comicService.updateComic(id, updatedComic);
    }

    @DeleteMapping("/{id}")
    public void deleteComic(@PathVariable Long id) {
        comicService.deleteComic(id);
    }
}
