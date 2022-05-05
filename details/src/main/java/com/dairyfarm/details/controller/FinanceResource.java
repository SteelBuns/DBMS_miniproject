package com.dairyfarm.details.controller;

import com.dairyfarm.details.model.Finance;
import com.dairyfarm.details.service.FinanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Finances")
public class FinanceResource {
    private final FinanceService financeService;

    public FinanceResource(FinanceService financeService) {
        this.financeService = financeService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Finance>> getAllFinance() {
        List<Finance> finances = financeService.findAllFinance();
        return new ResponseEntity<>(finances, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getFinanceById(@PathVariable("id") Integer id) {
        Optional<Finance> finance= financeService.findFinanceById(id);
        return new ResponseEntity<>(finance, HttpStatus.OK);
    }

    @GetMapping("/findByTrans_type/{id}")
    public ResponseEntity<?> getFinanceByTrans_type(@PathVariable("id") Finance.t trans_type) {
        Optional<List<Finance>>finance= financeService.findFinanceByTranstype(trans_type);
        return new ResponseEntity<>(finance, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Finance> addFinance(@RequestBody Finance finance) {
        Finance newAnimal = financeService.addFinance(finance);
        return new ResponseEntity<>(newAnimal, HttpStatus.CREATED);
    }

    @PutMapping("/update")

    public ResponseEntity<Finance> updateFinance(@RequestBody Finance finance) {
        Finance updateAnimal = financeService.updateFinance(finance);
        return new ResponseEntity<>(updateAnimal, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteFinance(@PathVariable("id") Integer id) {
        financeService.deleteFinance(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
