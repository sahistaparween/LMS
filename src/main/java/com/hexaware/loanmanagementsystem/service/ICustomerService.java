package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


public interface ICustomerService {
	
	public List<Customer> findAllCustomers();
	public Optional <Customer> getCustomerById(Long customerId)throws ResourceNotFoundException;
	public void deleteByCustomerId(Long customerId)throws ResourceNotFoundException;
	public Customer savecustomer(Customer customerId);
	 public Customer updateCustomer(Customer customer,Long customerId);
	public List<Customer> findByCustomerName(String customerName);
	
}
