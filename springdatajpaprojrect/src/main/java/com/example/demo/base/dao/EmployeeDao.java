package com.example.demo.base.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.base.dto.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	public Employee findByEmpId(int id);

}
