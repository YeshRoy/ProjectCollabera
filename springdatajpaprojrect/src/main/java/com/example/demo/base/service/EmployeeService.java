package com.example.demo.base.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.base.dto.Employee;

public interface EmployeeService {
	public Employee getData(int id); 
	
	public void deleteData(Employee employee,int id); 
	
	public Employee addData(Employee employee); 
	
	public Employee updateData(Employee employee);
	
	public List<Employee> findAll();

}
