package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.MedicinesDAO;
import com.dairyfarm.details.model.Medicines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicinesService {
    private final MedicinesDAO medicinesDAO;
@Autowired
    public MedicinesService(MedicinesDAO medicinesDAO) {
        this.medicinesDAO = medicinesDAO;
    }
    public Medicines addMedicines(Medicines medicines){
        return medicinesDAO.save(medicines);
    }
    public List<Medicines> findAllMedicines(){
        return medicinesDAO.findAll();
    }
    public Medicines findMedicinesById(Integer id){
        return medicinesDAO.getById(id);
    }
    public Medicines updateMedicines(Medicines medicines){
        return medicinesDAO.save(medicines);
    }
    public void deleteMedicines(Integer id){
        medicinesDAO.deleteById(id);
    }

}
