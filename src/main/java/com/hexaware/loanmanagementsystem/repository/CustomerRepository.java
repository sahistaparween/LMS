package com.hexaware.loanmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.Customer;

@Repository
//@EnableJpaRepositories 
public interface CustomerRepository extends JpaRepository<Customer,Long> {
	public List<Customer> findByCustomerName(String customerName);

	
	

	
	

		
}



