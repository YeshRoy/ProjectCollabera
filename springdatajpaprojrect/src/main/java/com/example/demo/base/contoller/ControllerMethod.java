package com.example.demo.base.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.dto.Employee;
import com.example.demo.base.service.EmployeeService;
@RestController
public class ControllerMethod {
	@Autowired
	private EmployeeService service ; 
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<?> getData(@PathVariable(name = "empId") int id) {
		 try {
			Employee employee=service.getData(id);
			 return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
		
	}
	@DeleteMapping("/employee/{empId}")
	public ResponseEntity<?> deleteData(@PathVariable(name = "empId")  int id,Employee employee) {
		try {
			service.deleteData(employee, id);
			return new ResponseEntity<String>("data deleted successfully",HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("data not found for corresponding id",HttpStatus.INTERNAL_SERVER_ERROR);			
		}
		
	}
     
	@PostMapping("/employee/{empId}")
	public ResponseEntity<?> addData(@RequestBody Employee employee ) {
		try {
			service.addData(employee);
			return new ResponseEntity<String>("data added successfilly",HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/employee/{empId}")
	public ResponseEntity<?> updateData(@RequestBody Employee employee) {
		service.updateData(employee);
		return new ResponseEntity<String>("updated successfully",HttpStatus.OK);
		
	}
	@GetMapping("/getemployee")
	public List<Employee> getAll() {
		List<Employee> employees =service.findAll();
		return employees;
		
	}
}
