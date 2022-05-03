package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.AnimalDAO;
import com.dairyfarm.details.model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    private final AnimalDAO animalDAO;

    @Autowired
    public AnimalService(AnimalDAO animalDAO) {
        this.animalDAO = animalDAO;
    }

    public Animals addAnimal(Animals animals) {
        return animalDAO.save(animals);
    }

    public List<Animals> findAllAnimals() {
        return animalDAO.findAll();
    }
    public Animals updateAnimals(Animals animals){
        return animalDAO.save(animals);
    }
    public void deleteAnimal(Integer animal_number){
         animalDAO.deleteById(animal_number);
    }
    public Optional<Animals> findAnimalById(Integer animal_number){
        return animalDAO.findById(animal_number);
    }
    public Optional<List<Animals>> findByStateOfAnimal(Animals.k state)
    {
        return animalDAO.findByState(state);
    }
}
