package com.nareshit.transactionmgmt.service;

import javax.management.RuntimeErrorException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nareshit.transactionmgmt.model.Audit;
import com.nareshit.transactionmgmt.model.Employee;
import com.nareshit.transactionmgmt.model.Insurance;

@Service
public class OrganizationService {

	@Autowired
	private EmployeeService empService;

	@Autowired
	private InsuranceService insService;


	@Autowired
	private AuditService auditService;

	@Transactional( propagation  = Propagation.REQUIRED) //Default Propogration Level -> Required
	public void onBoardEmployee(Employee emp, Insurance ins) {




		Employee employee = empService.addEmployee(emp);  //1

		if (employee.getEmpId() != null) {
			//2
			auditService.saveAudit(new Audit("Employee creation is sucess for " + employee.getEmpName()));
			ins.setEmpId(employee.getEmpId());

		} else {
			//2
			auditService.saveAudit(new Audit("Employee creation is Failed for " + employee.getEmpName()));
		}




		if (ins.getHealthInsuranceSchemeName().length() <= 5) {
			//3
			auditService.saveAudit(new Audit("Insurance creation is Failed for  with insurance Name ....."
					+ ins.getHealthInsuranceSchemeName() + "....." + employee.getEmpName()));
			throw new RuntimeErrorException(null, "Error in Insurance");
		}

		else {
			//4

			insService.registerInsurance(ins);


			//3
			auditService.saveAudit(new Audit("Insurance creation is Sucess for " + employee.getEmpName()));
		}

	}



}
