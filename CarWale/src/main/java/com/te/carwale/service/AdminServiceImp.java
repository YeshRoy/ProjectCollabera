package com.te.carwale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.te.carwale.bean.Admin;
import com.te.carwale.bean.MyAdminDetails;
import com.te.carwale.dao.AdminDao;

@Service
public class AdminServiceImp implements AdminService,UserDetailsService{
	@Autowired
	private AdminDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Admin admin = dao.findByUserName(username);
		if (admin != null) {
			return new MyAdminDetails(admin);
		} else {
		 	throw new UsernameNotFoundException("User not found");
		}
	}
	
	@Override
	public Admin addData(Admin admin) {
		return dao.save(admin);
	}

	@Override
	public Admin getData(String username) {
		
		return dao.findByUserName(username);
	}

	@Override
	public Admin updateData(Admin admin) {
		return dao.save(admin);
	}


}
