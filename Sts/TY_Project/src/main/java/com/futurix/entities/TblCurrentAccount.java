
package com.futurix.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TblCurrentAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Long accountNumber;

	private double overDraftLimit;
	private String overDraftStatus;
	private double Charges;
	public TblCurrentAccount(int id, Long accountNumber, double overDraftLimit, String overDraftStatus,
			double charges) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.overDraftLimit = overDraftLimit;
		this.overDraftStatus = overDraftStatus;
		Charges = charges;
	}
	public TblCurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	public String getOverDraftStatus() {
		return overDraftStatus;
	}
	public void setOverDraftStatus(String overDraftStatus) {
		this.overDraftStatus = overDraftStatus;
	}
	public double getCharges() {
		return Charges;
	}
	public void setCharges(double charges) {
		Charges = charges;
	}
	

}

