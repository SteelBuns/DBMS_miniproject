package com.dairyfarm.details.controller;

import com.dairyfarm.details.model.Medicines;
import com.dairyfarm.details.service.MedicinesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Medicine")
public class MedicinesResource {
    private final MedicinesService medicinesService;

    public MedicinesResource(MedicinesService medicinesService) {
        this.medicinesService = medicinesService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Medicines>> getAllMedicines() {
        List<Medicines> medicines = medicinesService.findAllMedicines();
        return new ResponseEntity<>(medicines, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Medicines> getMedicinesById(@PathVariable("id") Integer id) {
        Medicines medicine= medicinesService.findMedicinesById(id);
        return new ResponseEntity<>(medicine, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Medicines> addMedicine(@RequestBody Medicines medicines) {
        Medicines newAnimal = medicinesService.addMedicines(medicines);
        return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
    }

    @PutMapping("/update")

    public ResponseEntity<Medicines> updateMedicine(@RequestBody Medicines medicines) {
        Medicines updateAnimal = medicinesService.updateMedicines(medicines);
        return new ResponseEntity<>(updateAnimal, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteMedicine(@PathVariable("id") Integer id) {
        medicinesService.deleteMedicines(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
