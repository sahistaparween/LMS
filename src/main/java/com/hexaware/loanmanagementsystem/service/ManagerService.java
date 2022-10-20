package com.hexaware.loanmanagementsystem.service;


import java.util.List;
import java.util.Optional;

import com.hexaware.loanmanagementsystem.entity.Manager;
import com.hexaware.loanmanagementsystem.exception.ResourceNotFoundException;


public interface ManagerService {
	
	public List<Manager> findAllManager();
	public Optional<Manager> getManagerById(Long manager_id)throws ResourceNotFoundException;
	public void deleteManagerById(Long manager_id)throws ResourceNotFoundException;
	public Manager savemanager(Manager manager);
	public int managerupdate(Manager manager,Long manager_id)throws ResourceNotFoundException;

	
}
