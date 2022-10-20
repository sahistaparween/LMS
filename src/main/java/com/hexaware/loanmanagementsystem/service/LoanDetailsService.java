package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.LoanDetails;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;

public interface LoanDetailsService {


	public List<LoanDetails> findAllloan();
	public Optional<LoanDetails>getLoanById(Long loan_id)throws ResourceNotFoundException;

	public void deleteById(Long loan_id)throws ResourceNotFoundException;;
	public LoanDetails save(LoanDetails loandetails);
	public int LoanDetailsupdate(LoanDetails loandetaials,Long loan_id)throws ResourceNotFoundException;
}