package com.hexaware.loanmanagementsystem.service;

import java.util.List;

import com.hexaware.loanmanagementsystem.entity.Manager;


public interface ManagerService {
	public List<Manager> findAll();
	public Manager findById(Long manager_id);
	public void deleteById(Long manager_id);
	public Manager save(Manager manager);
	public int update(Manager manager,Long manager_id);

}
