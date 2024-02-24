package com.futurix.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TblCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	    private String cardNumber;

	    private Long accountNumber;

	    private String cardStatus;
	    
	    private Date dateOfIssue;

		private Date dateOfExpiry;

	    private Integer pin;


	    
	    
		public TblCard(int id, String cardNumber, Long accountNumber, String cardStatus, Date dateOfIssue,
				Date dateOfExpiry, Integer pin) {
			super();
			this.id = id;
			this.cardNumber = cardNumber;
			this.accountNumber = accountNumber;
			this.cardStatus = cardStatus;
			this.dateOfIssue = dateOfIssue;
			this.dateOfExpiry = dateOfExpiry;
			this.pin = pin;
		}




		public TblCard() {
			super();
			// TODO Auto-generated constructor stub
		}




		public int getId() {
			return id;
		}




		public void setId(int id) {
			this.id = id;
		}




		public String getCardNumber() {
			return cardNumber;
		}




		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}




		public Long getAccountNumber() {
			return accountNumber;
		}




		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}




		public String getCardStatus() {
			return cardStatus;
		}




		public void setCardStatus(String cardStatus) {
			this.cardStatus = cardStatus;
		}




		public Date getDateOfIssue() {
			return dateOfIssue;
		}




		public void setDateOfIssue(Date dateOfIssue) {
			this.dateOfIssue = dateOfIssue;
		}




		public Date getDateOfExpiry() {
			return dateOfExpiry;
		}




		public void setDateOfExpiry(Date dateOfExpiry) {
			this.dateOfExpiry = dateOfExpiry;
		}




		public Integer getPin() {
			return pin;
		}




		public void setPin(Integer pin) {
			this.pin = pin;
		}
	    
	    
	    
}
