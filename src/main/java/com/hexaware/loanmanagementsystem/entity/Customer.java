package com.hexaware.loanmanagementsystem.entity;


import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name= "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customerId")
	public Long customerId;
	
	@Column(name="customerPassword")
	public String customerPassword;
	


	@Column(name="customerName")
	public String customerName;
	
	@Column(name="customerEmail")
	public String customerEmail;
	
	
	@Column(name="customerPhone")
	public String customerPhone;
	
	
	@Column(name="customerAddress")
	public String customerAddress;
	
	
	@Column(name="customerGender")
	public String customerGender;
	
	@Column(name="customerBankAccountNo")
	public String customerBankAccountNo;
	
	@Column(name="customerIncomeCategory")
	public String customerIncomeCategory;
	
	@Column(name="customerIncome")
	public String customerIncome;
	
	@Column(name="customerPANno")
	public String customerPANno;
	
	
	//@DateTimeFormat(pattern="yyyy-MM-dd") 
	@Column(name="customerDOB")
	public String customerDOB;
	
	
	

	@OneToMany(fetch = FetchType.EAGER, cascade =CascadeType.ALL)
	@JoinColumn(name="customerId_fk",referencedColumnName="customerId")
	private List<LoanDetails> loandetailsList =new ArrayList<>();
	/*
	@ManyToOne
    @JoinColumn(name="managerId", nullable=false)
	public Manager manager;
*/
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Long customerId, String customerPassword, String customerName, String customerEmail,
			String customerPhone, String customerAddress, String customerGender, String customerBankAccountNo,
			String customerIncomeCategory, String customerIncome, String customerPANno, String customerDOB,
			List<LoanDetails> loandetailsList, Manager manager) {
		super();
		this.customerId = customerId;
		this.customerPassword = customerPassword;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
		this.customerGender = customerGender;
		this.customerBankAccountNo = customerBankAccountNo;
		this.customerIncomeCategory = customerIncomeCategory;
		this.customerIncome = customerIncome;
		this.customerPANno = customerPANno;
		this.customerDOB = customerDOB;
		this.loandetailsList = loandetailsList;
	//	this.manager = manager;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerBankAccountNo() {
		return customerBankAccountNo;
	}

	public void setCustomerBankAccountNo(String customerBankAccountNo) {
		this.customerBankAccountNo = customerBankAccountNo;
	}

	public String getCustomerIncomeCategory() {
		return customerIncomeCategory;
	}

	public void setCustomerIncomeCategory(String customerIncomeCategory) {
		this.customerIncomeCategory = customerIncomeCategory;
	}

	public String getCustomerIncome() {
		return customerIncome;
	}

	public void setCustomerIncome(String customerIncome) {
		this.customerIncome = customerIncome;
	}

	public String getCustomerPANno() {
		return customerPANno;
	}

	public void setCustomerPANno(String customerPANno) {
		this.customerPANno = customerPANno;
	}

	public String getCustomerDOB() {
		return customerDOB;
	}

	public void setCustomerDOB(String customerDOB) {
		this.customerDOB = customerDOB;
	}

	public List<LoanDetails> getLoandetailsList() {
		return loandetailsList;
	}

	public void setLoandetailsList(List<LoanDetails> loandetailsList) {
		this.loandetailsList = loandetailsList;
	}

	/*public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

*/
	
	
}