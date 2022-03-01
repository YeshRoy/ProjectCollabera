package com.microservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bean.Department;
@Repository
public interface DepartmentDao extends CrudRepository<Department, Integer> {

	public Department findByDeptId(int id);
}
