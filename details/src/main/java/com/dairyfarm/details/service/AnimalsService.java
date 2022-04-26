package com.dairyfarm.details.service;

import com.dairyfarm.details.model.Animals;

import java.util.List;

public interface AnimalsService {


    List<Animals> get();

    Animals get(int animalNumber);

    void save(Animals animals);

    void delete(int animalNumber);
}
