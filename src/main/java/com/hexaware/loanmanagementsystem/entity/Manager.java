package com.hexaware.loanmanagementsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="manager_id")
	public Long manager_id;
	
	
	@Column(name="manager_email")
	public String manager_email;
	
	@Column(name="manager_password")
	public String manager_password;
	
	@Column(name="manager_name")
	public String manager_name;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getManager_id() {
		return manager_id;
	}

	public void setManager_id(Long manager_id) {
		this.manager_id = manager_id;
	}

	public String getManager_email() {
		return manager_email;
	}

	public void setManager_email(String manager_email) {
		this.manager_email = manager_email;
	}

	public String getManager_password() {
		return manager_password;
	}

	public void setManager_password(String manager_password) {
		this.manager_password = manager_password;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public Manager(Long manager_id, String manager_email, String manager_password, String manager_name) {
		super();
		this.manager_id = manager_id;
		this.manager_email = manager_email;
		this.manager_password = manager_password;
		this.manager_name = manager_name;
	}

	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_email=" + manager_email + ", manager_password="
				+ manager_password + ", manager_name=" + manager_name + "]";
	}
	
	

}