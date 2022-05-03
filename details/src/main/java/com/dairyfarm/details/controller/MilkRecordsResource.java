package com.dairyfarm.details.controller;

import com.dairyfarm.details.model.MilkRecords;
import com.dairyfarm.details.service.MilkRecordsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/MilkRecords")
public class MilkRecordsResource {
    private final MilkRecordsService milkRecordsService;

    public MilkRecordsResource(MilkRecordsService milkRecordsService) {
        this.milkRecordsService = milkRecordsService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<MilkRecords>> getAllMilkRecords() {
        List<MilkRecords> milkRecords = milkRecordsService.findAllMilkRecords();
        return new ResponseEntity<>(milkRecords, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getMilkRecordsById(@PathVariable("id") Integer id) {
        Optional<MilkRecords> milkrecord= milkRecordsService.findMilkRecordById(id);
        return new ResponseEntity<>(milkrecord, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MilkRecords> addMedicine(@RequestBody MilkRecords milkRecords) {
        MilkRecords newMilkRecord = milkRecordsService.addMilkRecord(milkRecords);
        return new ResponseEntity<>(newMilkRecord, HttpStatus.CREATED);
    }

    @PutMapping("/update")

    public ResponseEntity<MilkRecords> updateMedicine(@RequestBody MilkRecords milkRecords ) {
        MilkRecords updateMilkRecord = milkRecordsService.updateMilkRecords(milkRecords);
        return new ResponseEntity<>(updateMilkRecord, HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteMedicine(@PathVariable("id") Integer id) {
        milkRecordsService.deleteMilkRecord(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
