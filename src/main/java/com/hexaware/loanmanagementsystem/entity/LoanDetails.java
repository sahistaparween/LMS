package com.hexaware.loanmanagementsystem.entity;

import java.time.Instant;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;


	@Entity
	@Table(name="LoanDetails")
	public class LoanDetails {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		 @GenericGenerator(name = "uuid", strategy = "uuid2")
		@Column(name="loanId")
		public Long loanId;
		
		@Column(name="loanStatus")
		public String loanStatus;
		
		@Column(name="loanTerm")
		public String loanTerm;
		
		@CreatedDate
		 private Instant loanStartDate;

//		@Column(name="loanstartdate")
//		public String loanStartDate;
		
		//public float loanProcesingFee;
		
		@Column(name="loanAmount")
		public float loanAmount;
		
		@Column(name="loanPayment")
		public Long loanPayment;
		
		@Column(name="loanDocuments")
		@Lob
		  private byte[] loanDocuments;
		
		
		@Column(name="loan_Type")
		public String loanType;
		
		@Column(name="loanBalance")
		public Long loanBalance;
/*		
		@ManyToOne
	    @JoinColumn(name="managerId", nullable=false)
		public Manager manager;
		
*/

		public LoanDetails() {
			// TODO Auto-generated constructor stub
		}
public LoanDetails(Long loanId, String loanStatus, String loanTerm, Instant loanStartDate, float loanAmount,
		Long loanPayment, byte[] loanDocuments, String loanType, Long loanBalance) {
	super();
	this.loanId = loanId;
	this.loanStatus = loanStatus;
	this.loanTerm = loanTerm;
	this.loanStartDate = loanStartDate;
	this.loanAmount = loanAmount;
	this.loanPayment = loanPayment;
	this.loanDocuments = loanDocuments;
	this.loanType = loanType;
	this.loanBalance = loanBalance;
}
public Long getLoanId() {
	return loanId;
}
public void setLoanId(Long loanId) {
	this.loanId = loanId;
}
public String getLoanStatus() {
	return loanStatus;
}
public void setLoanStatus(String loanStatus) {
	this.loanStatus = loanStatus;
}
public String getLoanTerm() {
	return loanTerm;
}
public void setLoanTerm(String loanTerm) {
	this.loanTerm = loanTerm;
}
public Instant getLoanStartDate() {
	return loanStartDate;
}
public void setLoanStartDate(Instant loanStartDate) {
	this.loanStartDate = loanStartDate;
}
public float getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(float loanAmount) {
	this.loanAmount = loanAmount;
}
public Long getLoanPayment() {
	return loanPayment;
}
public void setLoanPayment(Long loanPayment) {
	this.loanPayment = loanPayment;
}
public byte[] getLoanDocuments() {
	return loanDocuments;
}
public void setLoanDocuments(byte[] loanDocuments) {
	this.loanDocuments = loanDocuments;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public Long getLoanBalance() {
	return loanBalance;
}
public void setLoanBalance(Long loanBalance) {
	this.loanBalance = loanBalance;
}
		

		
		
}