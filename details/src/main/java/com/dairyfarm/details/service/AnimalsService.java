package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.AnimalsDAO;
import com.dairyfarm.details.model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalsService {
    private final AnimalsDAO animalsDAO;
   @Autowired
    public AnimalsService(AnimalsDAO animalsDAO) {
        this.animalsDAO = animalsDAO;
    }
    public Animals addAnimals(Animals animals){
        return animalsDAO.save(animals);
    }
    public List<Animals> findAllAnimals(){
        return animalsDAO.findAll();
    }
    public Optional<Animals> findAnimalsById(Integer id){
        return animalsDAO.findById(id);
    }
    public Animals updateAnimals(Animals animals){
        return animalsDAO.save(animals);
    }
    public void deleteAnimals(Integer id){
        animalsDAO.deleteById(id);
    }

}
