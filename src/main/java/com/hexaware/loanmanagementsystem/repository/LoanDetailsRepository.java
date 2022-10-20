package com.hexaware.loanmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.entity.LoanDetails;
//@Repository
//@EnableJpaRepositories 
public interface LoanDetailsRepository extends JpaRepository<LoanDetails,Long> {
	public List<LoanDetails> findByLoantype(String loantype);
}
