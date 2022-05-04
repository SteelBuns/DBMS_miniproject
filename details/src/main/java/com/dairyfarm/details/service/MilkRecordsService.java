package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.MilkRecordsDAO;
import com.dairyfarm.details.model.MilkRecords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MilkRecordsService {
    private final MilkRecordsDAO milkRecordsDAO;
    @Autowired
    public MilkRecordsService(MilkRecordsDAO milkRecordsDAO) {
        this.milkRecordsDAO = milkRecordsDAO;
    }

    public MilkRecords addMilkRecord(MilkRecords milkRecords) {
        return milkRecordsDAO.save(milkRecords);
    }

    public List<MilkRecords> findAllMilkRecords() {
        return milkRecordsDAO.findAll();
    }
    public MilkRecords updateMilkRecords(MilkRecords milkRecords){
        return milkRecordsDAO.save(milkRecords);
    }
    public void deleteMilkRecord(Integer milkRecords_number){
        milkRecordsDAO.deleteById(milkRecords_number);
    }
    public Optional<MilkRecords> findMilkRecordById(Integer milkRecords_number){
        return milkRecordsDAO.findById(milkRecords_number);
    }
    }

