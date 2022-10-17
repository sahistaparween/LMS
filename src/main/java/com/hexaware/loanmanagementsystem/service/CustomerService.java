package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.entity.Customer;


public interface CustomerService {
	public List<Customer> findAllCustomers();
	public Customer findById_customer(Long customer_id);
	public void deleteById_customer(Long customer_id);
	public Customer save_customer(Customer customer_id);
	public int update_customer(Customer customer,Long customer_id);

}
