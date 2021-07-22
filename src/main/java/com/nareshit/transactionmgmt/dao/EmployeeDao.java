package com.nareshit.transactionmgmt.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.transactionmgmt.model.Employee;

@Repository
public interface EmployeeDao  extends JpaRepository<Employee, Integer>{



}
