package com.te.carwale.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int id;
	@Column(name="username")
	private String userName;
	@Column(name="admin_name")
	private String name;
	@Column(name="admin_password")
	private String password;
	@Column(name="admin_role")
	private String role;
	
	
}
