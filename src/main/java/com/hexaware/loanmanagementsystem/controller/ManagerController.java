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

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.loanmanagementsystem.service.ManagerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/managerapi")
@Api(value = "Loan Management System",description = "Operations of Manager class")

public class ManagerController {
	@Autowired
	
	ManagerService managerService;
	
	@GetMapping("/getallmanager")
	@ApiOperation(value = "view a list of LoanDetailss",response = List.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200,message = "Successfully retrieved list of LoanDetailss"),
			@ApiResponse(code = 401,message = "you are not authorized to view this resource"),
			@ApiResponse(code = 403,message = "accessing of this resource forbidden"),
			@ApiResponse(code = 404,message = "Resource not found"),
	})
	public List<Manager> getAllManager(){
		return managerService.findAllManager();
	}
	
	@PostMapping("/addmanager")
	@ApiOperation(value = "add manager")
	public String saveManager(@RequestBody Manager manager) {
		return managerService.savemanager(manager) + "Manager added Successfully";
	}
	
	@GetMapping("/getmanager/{manager_id}")
	@ApiOperation(value = "Get a Manager by id")
	public Optional<Manager> getManagerById(@PathVariable("manager_id") Long manager_id) throws ResourceNotFoundException {
		return managerService.getManagerById(manager_id);
	}
	
	

}
