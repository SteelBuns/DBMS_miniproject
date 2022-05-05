package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnimalsDAO extends JpaRepository<Animals,Integer> {
    Optional<List<Animals>> findAnimalsByState(Animals.k state);
}
