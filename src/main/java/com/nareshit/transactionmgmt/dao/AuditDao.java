package com.nareshit.transactionmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.transactionmgmt.model.Audit;

@Repository
public interface AuditDao  extends JpaRepository<Audit, Integer>{



}
