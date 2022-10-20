package com.hexaware.loanmanagementsystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.entity.LoanDetails;

import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;





import com.hexaware.loanmanagementsystem.service.ILoanDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/loandetailsapi")
@Api(value = "Loan Management System",description = "Operations of LoanDetails class")
public class LoanDetailsController {
	
	@Autowired
	ILoanDetailsService LoanDetailsService;
	
	@GetMapping("/getallloandetails")
	@ApiOperation(value = "view a list of LoanDetailss",response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,message = "Successfully retrieved list of LoanDetailss"),
			@ApiResponse(code = 401,message = "you are not authorized to view this resource"),
			@ApiResponse(code = 403,message = "accessing of this resource forbidden"),
			@ApiResponse(code = 404,message = "Resource not found"),
	})
	public List<LoanDetails> getLoanDetails(){
		return LoanDetailsService.findAllloan();
	}
	
	
	@PostMapping("/addloandetails")
	@ApiOperation(value = "Add LoanDetails ")
	public String saveLoanDetails(
			@ApiParam (value = "LoanDetailsDetails is stored in database",required = true)
			@RequestBody LoanDetails loandetails) {
		return LoanDetailsService.save(loandetails) + "added successfully";
	}
	
	@DeleteMapping("/deleteloandetails/{loan_id}")
	@ApiOperation(value = "Delete a LoanDetail by id")
	public void deleteLoanDetails(@PathVariable("loan_id") Long loan_id)throws ResourceNotFoundException {
		 LoanDetailsService.deleteById(loan_id) ;
	}
	
	@GetMapping("/getloandetails/{loan_id}")
	@ApiOperation(value = "Get a LoanDetails by id")
	public Optional<LoanDetails> getLoanDetails(
			@ApiParam (value = "Returns the LoanDetails with Id",required = true)
			@PathVariable("loan_id") Long loan_id) throws ResourceNotFoundException {
		return LoanDetailsService.getLoanById(loan_id);
	}
	
	@PutMapping("/updateloandetails{loan_id}")
	@ApiOperation(value = "Get a LoanDetails by id")
	public LoanDetails Update(
			@ApiParam (value = "LoanDetails object to update",required = true)
			@RequestBody LoanDetails loandetails,
			@ApiParam (value="returns the customer with id to update",required = true)
			@PathVariable("loan_id") Long loan_id)throws Exception {

		LoanDetails existingLoanDetails =  LoanDetailsService.getLoanById(loan_id)
				.orElseThrow(() -> new Exception("Loan Not Found" + loan_id));
		existingLoanDetails.setLoan_id(loandetails.getLoan_id());
		existingLoanDetails.setLoantype(loandetails.getLoantype());
		
		
		return LoanDetailsService.updateLoanDetails(existingLoanDetails, loan_id);
	}
}
