package com.hexaware.loanmanagementsystem.controller;
import java.util.List;

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
import com.hexaware.loanmanagementsystem.service.CustomerService;


@RestController
@RequestMapping("/customerapi")

public class CustomerController {
	@Autowired
	CustomerService customerservice ;
	
	@GetMapping("/getallcustomers")
	public List<Customer> getAllCustomers(){
		return customerservice.findAllCustomers();
		}
	@PostMapping("/addcustomers")
	public String saveCustomer(@RequestBody Customer customer) {
		return customerservice.save_customer(customer) + "New Customer added Successfully";
	}
	
	@DeleteMapping("/deletecustomer/{customer_id}")
	public void deleteCustomer(@PathVariable("customer_id") Long customer_id) {
		 customerservice.deleteById_customer(customer_id) ;
	}
	
	@GetMapping("/getcustomer/{customer_id}")
	public Customer getCustomer(@PathVariable("customer_id") Long customerId) {
		return customerservice.findById_customer(customerId);
	}
	
	@PutMapping("/updatecustomer/{customer_id}")
	public String Update(@RequestBody Customer customer,@PathVariable("customer_id") Long customer_id) {
		return customerservice.update_customer(customer, customer_id) + " Customer details updated successfully";
	}

}
