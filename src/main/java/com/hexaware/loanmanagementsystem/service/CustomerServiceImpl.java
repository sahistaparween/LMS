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
	public Optional<Customer> getCustomerById(Long customer_id) throws ResourceNotFoundException{
		return customerRepo.findById(customer_id);
	}

	@Override
	public void deleteById_customer(Long customer_id)throws ResourceNotFoundException {
		customerRepo.deleteById(customer_id);
	}

	@Override
	public Customer save_customer(Customer customer) {
		return customerRepo.save(customer);
	}


	@Override
	public Customer updatecustomer(Customer customer) throws ResourceNotFoundException {
		
		return customerRepo.save(customer);
}
}

	


