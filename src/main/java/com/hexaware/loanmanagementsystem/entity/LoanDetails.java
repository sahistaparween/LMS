package com.hexaware.loanmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

	@Entity
	@Table(name="LoanDetails")
	public class LoanDetails {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="loan_id")
		public Long loan_id;
		
		@Column(name="loan_status")
		public String loan_status;
		
		@Column(name="loan_term")
		public String loan_term;
		
		@Column(name="loan_date")
		public String loan_date;
		
		
		@Column(name="loan_amount")
		public float loan_amount;
		
		
		@Column(name="loan_type")
		public String loantype;
	

		public LoanDetails() {
			// TODO Auto-generated constructor stub
		}

		public Long getLoan_id() {
			return loan_id;
		}

		public void setLoan_id(Long loan_id) {
			this.loan_id = loan_id;
		}

		public String getLoan_status() {
			return loan_status;
		}

		public void setLoan_status(String loan_status) {
			this.loan_status = loan_status;
		}

		public String getLoan_term() {
			return loan_term;
		}

		public void setLoan_term(String loan_term) {
			this.loan_term = loan_term;
		}

		public String getLoan_date() {
			return loan_date;
		}

		public void setLoan_date(String loan_date) {
			this.loan_date = loan_date;
		}

		public float getLoan_amount() {
			return loan_amount;
		}

		public void setLoan_amount(float loan_amount) {
			this.loan_amount = loan_amount;
		}

		public String getLoantype() {
			return loantype;
		}

		public void setLoantype(String loantype) {
			this.loantype = loantype;
		}

		

		
}

		
