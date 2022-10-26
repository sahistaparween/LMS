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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Manager")
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="managerId")
	public Long managerId;
	
	
	@Column(name="managerEmail")
	public String managerEmail;
	
	@Column(name="managerPassword")
	public String managerPassword;
	
	@Column(name="managerName")
	public String managerName;
	
	@OneToMany(fetch =FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name= "managerId_fk",referencedColumnName="managerId")
	private List<LoanDetails> loandetailslist =new ArrayList<>();

	@OneToMany(fetch =FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name= "mangerId_fk",referencedColumnName="managerId")
	private List<Customer> customerlist =new ArrayList<>();
	
	
	public List<LoanDetails> getLoandetailslist() {
		return loandetailslist;
	}

	public void setLoandetailslist(List<LoanDetails> loandetailslist) {
		this.loandetailslist = loandetailslist;
	}

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getManagerPassword() {
		return managerPassword;
	}

	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public Manager(Long managerId, String managerEmail, String managerPassword, String managerName) {
		super();
		this.managerId = managerId;
		this.managerEmail = managerEmail;
		this.managerPassword = managerPassword;
		this.managerName = managerName;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerEmail=" + managerEmail + ", managerPassword="
				+ managerPassword + ", managerName=" + managerName + "]";
	}
	
	

}