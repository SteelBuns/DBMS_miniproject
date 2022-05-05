package com.dairyfarm.details.controller;

import com.dairyfarm.details.model.MedHistory;
import com.dairyfarm.details.service.MedHistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Med_History")
public class MedHistoryResource {
    private final MedHistoryService medHistoryService;

    public MedHistoryResource(MedHistoryService medHistoryService) {
        this.medHistoryService = medHistoryService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<MedHistory>> getAllMedHistory() {
        List<MedHistory> medHistory = medHistoryService.findAllMedHistory();
        return new ResponseEntity<>(medHistory, HttpStatus.OK);
    }

    @GetMapping("/find/{animal_number}")
    public ResponseEntity<?> getMedHistoryByAnimal_Number(@PathVariable("animal_number") Integer animal_number) {
        Optional<List<MedHistory>> medicine= medHistoryService.findMedHistoryByAnimalnumber(animal_number);
        return new ResponseEntity<>(medicine, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MedHistory> addMedHistory(@RequestBody MedHistory medHistory) {
        MedHistory newAnimal = medHistoryService.addMedHistory(medHistory);
        return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
    }

    @PutMapping("/update")

    public ResponseEntity<MedHistory> updateMedHistory(@RequestBody MedHistory medHistory) {
        MedHistory updateAnimal = medHistoryService.updateMedHistory(medHistory);
        return new ResponseEntity<>(updateAnimal, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteMedHistory(@PathVariable("id") Integer id) {
        medHistoryService.deleteMedHistory(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
