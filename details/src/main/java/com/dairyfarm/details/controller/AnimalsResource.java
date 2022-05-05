package com.dairyfarm.details.controller;

import com.dairyfarm.details.model.Animals;
import com.dairyfarm.details.service.AnimalsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/Animal")
public class AnimalsResource {
    private final AnimalsService animalsService;

    public AnimalsResource(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Animals>> getAllAnimals() {
        List<Animals> animals = animalsService.findAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getAnimalsById(@PathVariable("id") Integer id) {
        Optional<Animals> animals = animalsService.findAnimalsById(id);
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Animals> addAnimals(@RequestBody Animals animals) {
        Animals newAnimals = animalsService.addAnimals(animals);
        return new ResponseEntity<>(newAnimals, HttpStatus.CREATED);
    }

    @PutMapping("/update")

    public ResponseEntity<Animals> updateAnimals(@RequestBody Animals animals) {
        Animals updateAnimals = animalsService.updateAnimals(animals);
        return new ResponseEntity<>(updateAnimals, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteAnimals(@PathVariable("id") Integer id) {
        animalsService.deleteAnimals(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
