package com.nareshit.transactionmgmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.transactionmgmt.dao.InsuranceDao;
import com.nareshit.transactionmgmt.model.Insurance;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceDao insDao;

	public Insurance registerInsurance(Insurance insurance) {
		return insDao.save(insurance);

	}
}
