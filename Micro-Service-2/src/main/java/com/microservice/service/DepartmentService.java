package com.microservice.service;

import com.microservice.bean.Department;

public interface DepartmentService  {
	
	public Department getDept(int deptId);
	
	public Department addDept(Department department);
	


}
