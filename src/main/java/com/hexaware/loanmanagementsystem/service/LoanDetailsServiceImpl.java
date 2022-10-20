package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.LoanDetails;
import com.hexaware.loanmanagementsystem.repository.LoanDetailsRepository;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


@Service
public  class LoanDetailsServiceImpl implements LoanDetailsService{
	
	@Autowired
	LoanDetailsRepository loandetailsRepo;

	@Override
	public List<LoanDetails> findAllloan() {
		return loandetailsRepo.findAll();
	}

	@Override
	public  Optional<LoanDetails>getLoanById(Long loan_id) throws ResourceNotFoundException
	{
		return null;
	}

	@Override
	public void deleteById(Long loan_id)throws ResourceNotFoundException {
		loandetailsRepo.deleteById(loan_id);
	}

	@Override
	public LoanDetails save(LoanDetails loandetails) {
		return loandetailsRepo.save(loandetails);
	}

	@Override
	public int LoanDetailsupdate(LoanDetails loandetails, Long loan_id) throws ResourceNotFoundException
	{
		return 0;
	}

}