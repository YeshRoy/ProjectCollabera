package com.te.carwale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.carwale.bean.CarDetails;
import com.te.carwale.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	@Autowired
	private CarService service;
	
	@GetMapping("/get/{id}")
	public  ResponseEntity<?> getData(@PathVariable int id) {
		CarDetails details = service.findByCarId(id);
		if(details!=null) {
			return new ResponseEntity<CarDetails>(details,HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("details not found ",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/add")
	public ResponseEntity<?> addData(@RequestBody CarDetails details) {
		try {
			service.addData(details);
			return new ResponseEntity<String>("Details Added successfully",HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Details not found",HttpStatus.INTERNAL_SERVER_ERROR); 
		}
		
		
	}

}
