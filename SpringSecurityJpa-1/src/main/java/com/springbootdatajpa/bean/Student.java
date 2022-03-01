package com.springbootdatajpa.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student implements Serializable{
	@Id
	private int id;
	private String name;
	private Date dob;
	private String password;
	
}
