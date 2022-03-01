package com.springbootsecurity.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springbootsecurity.bean.MyUserDetails;
import com.springbootsecurity.bean.User;
import com.springbootsecurity.dao.UserDao;

public class MyUserDetailService implements UserDetailsService {
	
	private UserDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = dao.findByUserName(username);
		if(user!=null) {
			return new MyUserDetails(user);
		}
		throw new UsernameNotFoundException("User not found");
	}
	

}
