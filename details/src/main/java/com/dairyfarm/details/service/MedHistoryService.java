package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.MedHistoryDAO;
import com.dairyfarm.details.model.MedHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedHistoryService {
    private final MedHistoryDAO medHistoryDAO;
@Autowired
    public MedHistoryService(MedHistoryDAO medHistoryDAO) {
        this.medHistoryDAO = medHistoryDAO;
    }
    public MedHistory addMedHistory(MedHistory medHistory){
        return medHistoryDAO.save(medHistory);
    }
    public List<MedHistory> findAllMedHistory(){
        return medHistoryDAO.findAll();
    }
    public Optional<MedHistory> findMedHistoryById(Integer id){
        return medHistoryDAO.findById(id);
    }
    public MedHistory updateMedHistory(MedHistory medHistory){
        return medHistoryDAO.save(medHistory);
    }
    public void deleteMedHistory(Integer id){
        medHistoryDAO.deleteById(id);
    }

}
