package com.te.carwale.service;

import com.te.carwale.bean.Admin;

public interface AdminService {
	
	public Admin addData(Admin admin);
	
	public Admin getData(String username);

	public Admin updateData(Admin admin);
	
	

}
