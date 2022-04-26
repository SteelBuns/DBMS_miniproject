package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Animals;

import java.util.List;

public interface AnimalsDAO {


    List<Animals> get();

    Animals get(int animalNumber);

    void save(Animals animals);

    void delete(int animalNumber);
}


