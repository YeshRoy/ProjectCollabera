package com.microservice.pojo;

import com.microservice.bean.User;

public class ResponsetTemplateVO {

	private User user;

	private DepartmentPojo departmentpojo;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public DepartmentPojo getDepartmentpojo() {
		return departmentpojo;
	}

	public void setDepartmentpojo(DepartmentPojo departmentpojo) {
		this.departmentpojo = departmentpojo;
	}

}
