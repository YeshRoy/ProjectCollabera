package com.te.carwale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.carwale.bean.Admin;
import com.te.carwale.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService service;
	@PostMapping("/add")
	public ResponseEntity<?> addData(@RequestBody Admin admin ) {
		try {
			service.addData(admin);
			return new ResponseEntity<String>("Data added successfully",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Data not added",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/get/{email}")
	public ResponseEntity<?> getData(@PathVariable String email){
		Admin data = service.getData(email);
		if(data!=null) {
			return new ResponseEntity<Admin>(data,HttpStatus.OK);
			
		}else {
			return new ResponseEntity<String>("data not found",HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}
	@GetMapping("/update")
	public ResponseEntity<?>update(@PathVariable Admin admin){
		Admin updateData = service.updateData(admin);
		if(updateData!=null) {
		return new ResponseEntity<Admin>(updateData,HttpStatus.OK);
	}else {
		return new ResponseEntity<String>("update failed",HttpStatus.INTERNAL_SERVER_ERROR);
	  	}
	}
	
}