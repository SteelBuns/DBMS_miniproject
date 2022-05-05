package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.MedHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MedHistoryDAO extends JpaRepository<MedHistory,Integer> {
    Optional<List<MedHistory>> findByAnimalnumber(Integer animal_number);
}
