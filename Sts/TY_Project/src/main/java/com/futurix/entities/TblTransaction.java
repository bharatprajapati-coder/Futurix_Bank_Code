
package com.futurix.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TblTransaction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
		@Column(nullable = false)
	    private Integer transactionId;
		@Column(nullable = false)
		 private Long accountNumber;

		@Column(nullable = false)
	    private String transactionType;

	  
	    private Double amount;

	  
	    private Date date;

	    @Column(nullable = false)
	    private Long receiverAccountNumber;

	    
	    private String description;
	    @Column(nullable = false)
	   	 private String status;

	   private Integer transactionLimit;


		public TblTransaction() {
			super();
			// TODO Auto-generated constructor stub
		}


		public TblTransaction(int id, Integer transactionId, Long accountNumber, String transactionType, Double amount,
				Date date, Long receiverAccountNumber, String description, String status, Integer transactionLimit) {
			super();
			this.id = id;
			this.transactionId = transactionId;
			this.accountNumber = accountNumber;
			this.transactionType = transactionType;
			this.amount = amount;
			this.date = date;
			this.receiverAccountNumber = receiverAccountNumber;
			this.description = description;
			this.status = status;
			this.transactionLimit = transactionLimit;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public Integer getTransactionId() {
			return transactionId;
		}


		public void setTransactionId(Integer transactionId) {
			this.transactionId = transactionId;
		}


		public Long getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}


		public String getTransactionType() {
			return transactionType;
		}


		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}


		public Double getAmount() {
			return amount;
		}


		public void setAmount(Double amount) {
			this.amount = amount;
		}


		public Date getDate() {
			return date;
		}


		public void setDate(Date date) {
			this.date = date;
		}


		public Long getReceiverAccountNumber() {
			return receiverAccountNumber;
		}


		public void setReceiverAccountNumber(Long receiverAccountNumber) {
			this.receiverAccountNumber = receiverAccountNumber;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public Integer getTransactionLimit() {
			return transactionLimit;
		}


		public void setTransactionLimit(Integer transactionLimit) {
			this.transactionLimit = transactionLimit;
		}

	    
}

