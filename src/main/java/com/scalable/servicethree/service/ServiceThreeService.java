package com.scalable.servicethree.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scalable.servicethree.model.ServiceThreeModel;
import com.scalable.servicethree.repository.ServiceThreeRepository;


@Service
public class ServiceThreeService {

	@Autowired  
	ServiceThreeRepository userRepository;  
	public void delete(int empId)   
	{  
		userRepository.deleteById(empId);  
	}  
	public List<ServiceThreeModel> getAllEmployees(){
		List<ServiceThreeModel> users = new ArrayList<ServiceThreeModel>();  
		userRepository.findAll().forEach(user1 -> users.add(user1));  
		return users;  
	}
}
