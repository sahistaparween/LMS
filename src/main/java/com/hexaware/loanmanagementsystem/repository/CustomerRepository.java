package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {


	
	

		
}



