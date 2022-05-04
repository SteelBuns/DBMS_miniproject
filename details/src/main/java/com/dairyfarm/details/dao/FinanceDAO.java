package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.Finance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceDAO extends JpaRepository<Finance,Integer> {



}
