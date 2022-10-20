package com.hexaware.loanmanagementsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hexaware.loanmanagementsystem.entity.Manager;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long>{
	

	
	}