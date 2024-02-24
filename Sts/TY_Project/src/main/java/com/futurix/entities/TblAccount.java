
package com.futurix.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblAccount")
public class TblAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Long accountNumber;

    private String  customer;

    private String accountType;
    
    private Double balance;

    private String status;

    private Date dateOfOpen;

    private Date lastActivityDate;

	public TblAccount(Long accountNumber, String customer, String accountType, Double balance, String status,
			Date dateOfOpen, Date lastActivityDate) {
		super();
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.accountType = accountType;
		this.balance = balance;
		this.status = status;
		this.dateOfOpen = dateOfOpen;
		this.lastActivityDate = lastActivityDate;
	}

	public TblAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfOpen() {
		return dateOfOpen;
	}

	public void setDateOfOpen(Date dateOfOpen) {
		this.dateOfOpen = dateOfOpen;
	}

	public Date getLastActivityDate() {
		return lastActivityDate;
	}

	public void setLastActivityDate(Date lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
	}

    // Getters and setters omitted for brevity

    
    
}





