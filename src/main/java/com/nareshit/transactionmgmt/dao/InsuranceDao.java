package com.nareshit.transactionmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.nareshit.transactionmgmt.model.Insurance;

@Repository
public interface InsuranceDao  extends JpaRepository<Insurance, Integer>{

}
