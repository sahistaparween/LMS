package com.hexaware.loanmanagementsystem.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.repository.CustomerRepository;

import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public List<Customer> findAllCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Optional<Customer> getCustomerById(Long customerId) throws ResourceNotFoundException{
		return customerRepo.findById(customerId);
	}

	@Override
	public void deleteByCustomerId(Long customerId)throws ResourceNotFoundException {
		customerRepo.deleteById(customerId);
	}

	@Override
	public Customer savecustomer(Customer customer) {
		return customerRepo.save(customer);
	}


	@Override
	public Customer updateCustomer(Customer customer,Long customerId){
		
		return customerRepo.save(customer);
}

	@Override
	public List<Customer> findByCustomerName(String customerName) {
		
		return customerRepo.findByCustomerName(customerName);
	}
}

	


