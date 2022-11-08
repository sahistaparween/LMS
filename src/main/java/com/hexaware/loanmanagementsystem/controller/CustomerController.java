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
import com.hexaware.loanmanagementsystem.service.ICustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


@RestController
@RequestMapping("/customerapi")
@Api(value = "Loan Management System",description = "Operations of Customer class")
public class CustomerController {
	@Autowired
	ICustomerService customerservice ;
	
	@GetMapping("/getallcustomers")
	@ApiOperation(value = "view a list of customers",response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,message = "Successfully retrieved list of customers"),
			@ApiResponse(code = 401,message = "you are not authorized to view this resource"),
			@ApiResponse(code = 403,message = "accessing of this resource forbidden"),
			@ApiResponse(code = 404,message = "Resource not found"),
	})
	public List<Customer> getAllCustomers(){
		return customerservice.findAllCustomers();
		}
	@PostMapping("/savecustomer")
	@ApiOperation(value = "Add a customer ")
	public Customer saveCustomer(
			@ApiParam (value = "CustomerDetails is stored in database",required = true)
			@RequestBody Customer customer) {
		return customerservice.savecustomer(customer) ;
	}
	
	@DeleteMapping("/deletecustomer/{customerId}")
	@ApiOperation(value = "Delete a customer by id")
	public void deleteCustomer(@PathVariable("customerId") Long customerId) throws ResourceNotFoundException{
		 customerservice.deleteBycustomerId(customerId) ;
	}
	
	@GetMapping("/getcustomer/{customerId}")
	@ApiOperation(value = "Get a customer by id")
	public  Optional <Customer> getCustomerById(
			@ApiParam (value="returns the customer with id",required = true)
			@PathVariable("customerId") Long customerId) throws ResourceNotFoundException{
		return customerservice.getCustomerById(customerId);
	}
	
	@PutMapping("/updatecustomer/{customerId}")
	@ApiOperation(value = "update a customerby id.......")
	 public Customer Update(
			@ApiParam (value = "customer object to update",required = true)
			 @RequestBody Customer customer,
			@ApiParam (value="returns the customer with id to update",required = true)
			@PathVariable("customerId") Long customerId) throws Exception  {
		
		Customer existingCustomer =  customerservice.getCustomerById(customerId)
				.orElseThrow(() -> new Exception("Customer not found with id" + customerId));
		existingCustomer.setCustomerId(customer.getCustomerId());
		existingCustomer.setCustomerName(customer.getCustomerName());
		existingCustomer.setCustomerEmail(customer.getCustomerEmail());
		existingCustomer.setCustomerAddress(customer.getCustomerAddress());
		existingCustomer.setCustomerPhone(customer.getCustomerPhone());
		existingCustomer.setCustomerPassword(customer.getCustomerPassword());
		
		return customerservice.updatecustomer(existingCustomer, customerId);
		
	}

}
