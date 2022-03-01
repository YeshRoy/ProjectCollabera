package com.springbootsecurity.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class User {
	@Id
	@Column
	private int userid;
	@Column
	private String userName;
	@Column
	private String userpasssword;
	@Column
	private String userRole;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserpasssword() {
		return userpasssword;
	}
	public void setUserpasssword(String userpasssword) {
		this.userpasssword = userpasssword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
}
