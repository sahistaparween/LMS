package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.LoanDetails;
import com.hexaware.loanmanagementsystem.repository.LoanDetailsRepository;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


@Service
public  class LoanDetailsServiceImpl implements ILoanDetailsService{
	
	@Autowired
	LoanDetailsRepository loandetailsRepo;
	


	@Override
	public List<LoanDetails> findAllloan() {
		return loandetailsRepo.findAll();
	}

	@Override
	public  Optional<LoanDetails> getLoanById(Long loanId) throws ResourceNotFoundException
	{
		return loandetailsRepo.findById(loanId);
	}

	@Override
	public void deleteByLoanId(Long loanId)throws ResourceNotFoundException {
		loandetailsRepo.deleteById(loanId);
	}

	@Override
	public LoanDetails saveLoandetails(LoanDetails loandetails) {
		return loandetailsRepo.save(loandetails);
	}



	@Override
	public LoanDetails updateLoanDetails(LoanDetails loandetails, Long loanId) throws ResourceNotFoundException {
		
		return loandetailsRepo.save(loandetails);
	}
}