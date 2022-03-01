package com.example.demo.base.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee implements Serializable {
@Id	
private int empId;
private String empName;
private Date dob;
private String empPassword;
}
