package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bean.Department;
import com.microservice.service.DepartmentService;

@RestController

public class DepartmentController {

	@Autowired
	private DepartmentService service;

	@GetMapping("/getDept/{DeptId}")
	public Department getDept(@PathVariable int deptId) {
		return service.getDept(deptId);
	}

	@PostMapping("/Dept")
	public Department addDept(@RequestBody Department department) {
		return service.addDept(department);
	}
}
