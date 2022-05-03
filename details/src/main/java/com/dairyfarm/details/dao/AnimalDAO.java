package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Animals;
import com.dairyfarm.details.model.k;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnimalDAO extends JpaRepository<Animals,Integer> {


    Optional<List<Animals>> findByState(k state);
}
