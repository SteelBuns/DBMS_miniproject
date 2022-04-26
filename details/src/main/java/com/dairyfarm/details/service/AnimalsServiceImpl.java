package com.dairyfarm.details.service;


import com.dairyfarm.details.dao.AnimalsDAO;
import com.dairyfarm.details.model.Animals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalsService {


    @Autowired
    private AnimalsDAO dairyFarmDAO;

    @Transactional
    @Override
    public List<Animals> get() {
        return dairyFarmDAO.get();

    }

    @Transactional
    @Override
    public Animals get(int animalNumber) {

        return dairyFarmDAO.get(animalNumber);
    }

    @Transactional
    @Override
    public void save(Animals animal) {
        dairyFarmDAO.save(animal);

    }

    @Transactional
    @Override
    public void delete(int animalNumber) {
        dairyFarmDAO.delete(animalNumber);

    }
}
