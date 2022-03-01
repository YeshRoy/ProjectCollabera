package com.microservice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bean.User;
@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	public User findByUserId(int id);
}


