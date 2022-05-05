package com.dairyfarm.details.service;

import com.dairyfarm.details.dao.FinanceDAO;
import com.dairyfarm.details.model.Finance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FinanceService {
    private final FinanceDAO financeDAO;
    @Autowired
    public FinanceService(FinanceDAO financeDAO) {
        this.financeDAO = financeDAO;
    }
    public Finance addFinance(Finance finance){
        return financeDAO.save(finance);
    }
    public List<Finance> findAllFinance(){
        return financeDAO.findAll();
    }
    public Optional<Finance> findFinanceById(Integer id){
        return financeDAO.findById(id);
    }
    public Finance updateFinance(Finance finance){
        return financeDAO.save(finance);
    }
    public void deleteFinance(Integer id){
        financeDAO.deleteById(id);
    }



    public Optional<List<Finance>> findFinanceByTranstype(Finance.t trans_type) {
        return financeDAO.findFinanceByTranstype(trans_type);
    }
}
