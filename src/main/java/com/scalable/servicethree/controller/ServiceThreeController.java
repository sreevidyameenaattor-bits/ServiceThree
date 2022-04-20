package com.scalable.servicethree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.scalable.servicethree.model.ServiceThreeModel;
import com.scalable.servicethree.service.ServiceThreeService;

@RestController  
public class ServiceThreeController {
	@Autowired  
	ServiceThreeService userService;  
	@DeleteMapping("/user/{empId}")  
	private void deleteBook(@PathVariable("empId") int empId)   
	{  
		userService.delete(empId);  
	}  
	
	@GetMapping("/displayAll")
	public List<ServiceThreeModel> getAllEmployees(){
		return  userService.getAllEmployees();
		
	}
	
}
