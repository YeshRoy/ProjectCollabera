package com.springbootsecurity.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootsecurity.bean.User;

public interface UserDao extends CrudRepository<User, Integer>{
	
	public User findByUserName(String userName);

}
