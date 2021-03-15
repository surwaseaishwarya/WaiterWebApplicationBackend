package com.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.ResourceNotFound;
import com.app.pojos.User;
import com.app.repository.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

	// controller contaims repo..........

	@Autowired
	private UserRepository userRepo;

	@GetMapping
	public List<User> getAllUser() {

		return userRepo.findAll();

	}

	// create employee rest Api.......

	@PostMapping
	public User createEmployee(@RequestBody User employee) {
		return userRepo.save(employee);
	}

	// get employee by id ........
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {

		User user = userRepo.findById(id).orElseThrow(() -> new ResourceNotFound("not"));
				
		return ResponseEntity.ok(user);

	}

	// update employee rest api
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {

		User user = userRepo.findById(id).orElseThrow(() -> new ResourceNotFound("not"));

		user.setFirstName(userDetails.getFirstName());
		user.setLastName(userDetails.getLastName());
		user.setEmail(userDetails.getEmail());
		user.setPhoneNumber(userDetails.getPhoneNumber());
		user.setUserName(userDetails.getUserName());

		User updatedEmployee = userRepo.save(user);

		return ResponseEntity.ok(updatedEmployee);

	}
	
	
	
	
	//delete employee rest 
	
	@DeleteMapping("/{id}")
	
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		
		User user = userRepo.findById(id).orElseThrow(() -> new ResourceNotFound("THID ID IS NOT EXIST"));

		 userRepo.delete(user);
		
		 Map<String,Boolean> response=new HashMap<String, Boolean>();
		 response.put("deleted", Boolean.TRUE);
		 return ResponseEntity.ok(response);
		
	}
	
	

}
