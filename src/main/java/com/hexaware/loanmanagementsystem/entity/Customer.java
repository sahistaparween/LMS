package com.hexaware.loanmanagementsystem.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="customer_id")
	public Long customer_id;
	
	@Column(name="customer_password")
	public String customer_password;
	
	@Column(name="customer_name")
	public String customer_name;
	
	@Column(name="customer_email")
	public String customer_email;
	
	
	@Column(name="customer_phone")
	public String customer_phone;
	
	
	@Column(name="customer_address")
	public String customer_address;
	
	
	@Column(name="customer_gender")
	public String customer_gender;
	
	@Column(name="customer_bankAccountNo")
	public String customer_BankAccountNo;
	
	@Column(name="customer_IncomeCategory")
	public String customer_IncomeCategory;
	
	@Column(name="customer_Income")
	public String customer_Income;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_password() {
		return customer_password;
	}

	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public String getCustomer_phone() {
		return customer_phone;
	}

	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}

	public String getCustomer_address() {
		return customer_address;
	}

	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}

	public String getCustomer_gender() {
		return customer_gender;
	}

	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	public String getCustomer_BankAccountNo() {
		return customer_BankAccountNo;
	}

	public void setCustomer_BankAccountNo(String customer_BankAccountNo) {
		this.customer_BankAccountNo = customer_BankAccountNo;
	}

	public String getCustomer_IncomeCategory() {
		return customer_IncomeCategory;
	}

	public void setCustomer_IncomeCategory(String customer_IncomeCategory) {
		this.customer_IncomeCategory = customer_IncomeCategory;
	}

	public String getCustomer_Income() {
		return customer_Income;
	}

	public void setCustomer_Income(String customer_Income) {
		this.customer_Income = customer_Income;
	}

	public Customer(Long customer_id, String customer_password, String customer_name, String customer_email,
			String customer_phone, String customer_address, String customer_gender, String customer_BankAccountNo,
			String customer_IncomeCategory, String customer_Income) {
		super();
		this.customer_id = customer_id;
		this.customer_password = customer_password;
		this.customer_name = customer_name;
		this.customer_email = customer_email;
		this.customer_phone = customer_phone;
		this.customer_address = customer_address;
		this.customer_gender = customer_gender;
		this.customer_BankAccountNo = customer_BankAccountNo;
		this.customer_IncomeCategory = customer_IncomeCategory;
		this.customer_Income = customer_Income;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_password=" + customer_password + ", customer_name="
				+ customer_name + ", customer_email=" + customer_email + ", customer_phone=" + customer_phone
				+ ", customer_address=" + customer_address + ", customer_gender=" + customer_gender
				+ ", customer_BankAccountNo=" + customer_BankAccountNo + ", customer_IncomeCategory="
				+ customer_IncomeCategory + ", customer_Income=" + customer_Income + "]";
	}
	
	

}
