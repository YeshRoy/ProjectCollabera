package com.springbootdatajpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootdatajpa.bean.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {
	public Student findById(int id);
	

}
