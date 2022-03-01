package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bean.Department;
import com.microservice.dao.DepartmentDao;
@Service
public class DepartmentServiceImp implements DepartmentService {
	@Autowired
	private DepartmentDao dao; 

	@Override
	public Department getDept(int deptId) {
		return dao.findByDeptId(deptId);
	}
	
	@Override
	public Department addDept(Department department) {
		return dao.save(department);
	}


}


