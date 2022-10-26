package com.hexaware.loanmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;
import com.hexaware.loanmanagementsystem.repository.ManagerRepository;



@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	ManagerRepository managerRepo;

	@Override
	public List<Manager> findAllManager() {
		return managerRepo.findAll();
	}

	@Override
	public Optional<Manager> getManagerById(Long managerId) throws ResourceNotFoundException{
		return null ;
	}

	@Override
	public void deleteManagerById(Long managerId)throws ResourceNotFoundException {
		managerRepo.deleteById(managerId);
	}

	@Override
	public Manager savemanager(Manager manager){
		return managerRepo.save(manager);
	}

	

}
