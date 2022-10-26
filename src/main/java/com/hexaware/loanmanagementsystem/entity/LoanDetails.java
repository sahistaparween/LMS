package com.hexaware.loanmanagementsystem.entity;

import java.time.Instant;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;


	@Entity
	@Table(name="LoanDetails")
	public class LoanDetails {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
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
		
		public float loanProcesingFee;
		
		@Column(name="loanAmount")
		public float loanAmount;
		
		
		@Column(name="loan_Type")
		public String loanType;
		
		@Column(name="loanBalance")
		public float loanBalance;
/*		
		@ManyToOne
	    @JoinColumn(name="managerId", nullable=false)
		public Manager manager;
		
*/
		

		public LoanDetails() {
			// TODO Auto-generated constructor stub
		}



		public LoanDetails(Long loanId, String loanStatus, String loanTerm, Instant loanStartDate, float loanProcesingFee,
				float loanAmount, String loanType, float loanBalance, Manager manager) {
			super();
			this.loanId = loanId;
			this.loanStatus = loanStatus;
			this.loanTerm = loanTerm;
			this.loanStartDate = loanStartDate;
			this.loanProcesingFee = loanProcesingFee;
			this.loanAmount = loanAmount;
			this.loanType = loanType;
			this.loanBalance = loanBalance;
			//this.manager = manager;
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



		public Instant getloanStartDate() {
			return loanStartDate;
		}



		public void setloanStartDate(Instant loanStartDate) {
			this.loanStartDate = loanStartDate;
		}



		public float getLoanProcesingFee() {
			return loanProcesingFee;
		}



		public void setLoanProcesingFee(float loanProcesingFee) {
			this.loanProcesingFee = loanProcesingFee;
		}



		public float getLoanAmount() {
			return loanAmount;
		}



		public void setLoanAmount(float loanAmount) {
			this.loanAmount = loanAmount;
		}



		public String getLoanType() {
			return loanType;
		}



		public void setLoanType(String loanType) {
			this.loanType = loanType;
		}



		public float getLoanBalance() {
			return loanBalance;
		}



		public void setLoanBalance(float loanBalance) {
			this.loanBalance = loanBalance;
		}


/*
		public Manager getManager() {
			return manager;
		}



		public void setManager(Manager manager) {
			this.manager = manager;
		}

*/

		

		
		
		
		

	}		