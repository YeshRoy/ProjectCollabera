package com.example.demo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.base.dao.EmployeeDao;
import com.example.demo.base.dto.Employee;
@Service
public class EmployeeServiceImpli implements EmployeeService {
	@Autowired
    private EmployeeDao dao;
	@Override
	public Employee getData(int id) {
     return dao.findByEmpId(id);		
	}
	@Override
	public void deleteData(Employee employee, int id) {
		dao.delete(employee);
	}
	@Override
	public Employee addData(Employee employee) {
		
		return dao.save(employee);
	}
	@Override
	public Employee updateData(Employee employee) {
		return dao.save(employee);
	}
	@Override
	public List<Employee> findAll() {
		
		return (List<Employee>) dao.findAll();
	}
	
}
