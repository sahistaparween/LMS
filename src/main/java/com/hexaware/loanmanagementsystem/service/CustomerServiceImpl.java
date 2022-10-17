package com.hexaware.loanmanagementsystem.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.Customer;
import com.hexaware.loanmanagementsystem.repository.CustomerRepository;



public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository customerRepo;

	@Override
	public List<Customer> findAllCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Customer findById_customer(Long customer_id) {
		return customerRepo.findById(customer_id).get();
	}

	@Override
	public void deleteById_customer(Long customer_id) {
		customerRepo.deleteById(customer_id);
	}

	@Override
	public Customer save_customer(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public int update_customer(Customer customer, Long customer_id) {
		return 0;
	}

}
	


