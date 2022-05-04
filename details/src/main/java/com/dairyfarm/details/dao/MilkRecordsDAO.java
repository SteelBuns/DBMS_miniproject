package com.dairyfarm.details.dao;

import com.dairyfarm.details.model.MilkRecords;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MilkRecordsDAO extends JpaRepository<MilkRecords,Integer> {
}
