package com.microservice.service;

import com.microservice.bean.User;
import com.microservice.pojo.ResponsetTemplateVO;

public interface UserService {

	public User getUser(int userId);
	
	public User addData(User user);

	public ResponsetTemplateVO getuserDept(int userId);
}
