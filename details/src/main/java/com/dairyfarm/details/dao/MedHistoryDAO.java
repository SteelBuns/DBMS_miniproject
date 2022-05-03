package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.MedHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedHistoryDAO extends JpaRepository<MedHistory,Integer> {
}
