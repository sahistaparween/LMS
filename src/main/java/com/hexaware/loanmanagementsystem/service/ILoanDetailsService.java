package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.LoanDetails;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;

public interface ILoanDetailsService {


	public List<LoanDetails> findAllloan();
	//public Optional<LoanDetails>findByLoanId(Long loanId)throws ResourceNotFoundException;

	public void deleteByLoanId(Long loanId)throws ResourceNotFoundException;;
	public LoanDetails saveLoandetails(LoanDetails loandetails);
	LoanDetails updateLoanDetails(LoanDetails loandetails,Long loanId)throws ResourceNotFoundException;
	public Optional<LoanDetails> getLoanById(Long loanId)throws ResourceNotFoundException;
	public List<LoanDetails> findByLoanType(String loanType);
}