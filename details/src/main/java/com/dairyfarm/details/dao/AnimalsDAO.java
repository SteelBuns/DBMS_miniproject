package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Animals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalsDAO extends JpaRepository<Animals,Integer> {
}
