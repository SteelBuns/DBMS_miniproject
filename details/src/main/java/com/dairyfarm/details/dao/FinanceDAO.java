package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FinanceDAO extends JpaRepository<Finance,Integer> {



    Optional<List<Finance>> findFinanceByTranstype(Finance.t trans_type);
}
