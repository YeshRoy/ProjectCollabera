package com.microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.bean.User;
import com.microservice.dao.UserDao;
import com.microservice.pojo.DepartmentPojo;
import com.microservice.pojo.ResponsetTemplateVO;
@Service
public class UserServicesImp implements UserService {
	@Autowired
	private UserDao dao;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public User getUser(int userId) {
		return dao.findByUserId(userId);
	}
	@Override
	public User addData(User user) {
		return dao.save(user);
	}
	
	
	@Override
	public ResponsetTemplateVO getuserDept(int userId) {
		ResponsetTemplateVO responsetTemplateVO = new ResponsetTemplateVO();
		User user = dao.findByUserId(userId);
		DepartmentPojo departmentPojo = restTemplate.getForObject("https://localhost:8086/Dept"+user.getDepartmentId(),DepartmentPojo.class);
		responsetTemplateVO.setUser(user);
		responsetTemplateVO.setDepartmentpojo(departmentPojo);
		return responsetTemplateVO;
	}
}
