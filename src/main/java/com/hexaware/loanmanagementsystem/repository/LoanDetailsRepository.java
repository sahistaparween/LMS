package com.hexaware.loanmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import com.hexaware.loanmanagementsystem.entity.LoanDetails;
@Repository
public interface LoanDetailsRepository extends JpaRepository<LoanDetails,Long> {
}
