package com.nareshit.transactionmgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="audit")
public class Audit {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "audit_id")
	private Integer auditId;

	private String auditDescription;

	//Employee Creation Sucess for Ramu
	//Insurance Creation Failed for Ramu

	public Integer getAuditId() {
		return auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public String getAuditDescription() {
		return auditDescription;
	}

	public void setAuditDescription(String auditDescription) {
		this.auditDescription = auditDescription;
	}

	public Audit( String auditDescription) {
		super();

		this.auditDescription = auditDescription;
	}

	public Audit() {}
	@Override
	public String toString() {
		return "Audit [auditId=" + auditId + ", auditDescription=" + auditDescription + "]";
	}




}
