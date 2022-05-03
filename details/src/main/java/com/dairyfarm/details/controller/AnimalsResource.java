package com.dairyfarm.details.controller;

import com.dairyfarm.details.model.Animals;
import com.dairyfarm.details.model.k;
import com.dairyfarm.details.service.AnimalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Animals")
public class AnimalsResource {
    private final AnimalService animalService;

    public AnimalsResource(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Animals>> getAllEmployees() {
        List<Animals> animals = animalService.findAllAnimals();
        return new ResponseEntity<>(animals, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") Integer id) {
        Optional<Animals> animal= animalService.findAnimalById(id);
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Animals> addEmployee(@RequestBody Animals animal) {
        Animals newAnimal = animalService.addAnimal(animal);
        return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
    }

    @PutMapping("/update")

    public ResponseEntity<Animals> updateEmployee(@RequestBody Animals animal) {
        Animals updateAnimal = animalService.updateAnimals(animal);
        return new ResponseEntity<>(updateAnimal, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Integer id) {
        animalService.deleteAnimal(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @GetMapping("/findByState/{state}")
    public ResponseEntity<?> getAnimalByState(@PathVariable("state") k state) {
        Optional<List<Animals>> animal= animalService.findByStateOfAnimal(state);
        return new ResponseEntity<>(animal, HttpStatus.OK);
    }
}
