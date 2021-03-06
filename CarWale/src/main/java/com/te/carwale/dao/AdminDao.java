package com.te.carwale.dao;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.te.carwale.bean.Admin;

@EnableJpaRepositories
public interface AdminDao extends CrudRepository<Admin, String>{
	
	public Admin findByUserName(String username);

}
