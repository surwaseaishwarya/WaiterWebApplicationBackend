package com.app.controllers;


import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Status;
import com.app.pojos.User;
import com.app.services.UserService;

@RestController
public class UserControllers {
	
	
	@Autowired
    UserService userService;
	
	@GetMapping("/users")
	public List<User> getAllusers(User user) {
		
		return userService.getAllUser();
		}
	
    @PostMapping("/users/register")
    public Status registerUser(@Valid @RequestBody User newUser) {
        List<User> users = userService.getAllUser();               //
        System.out.println("New user: " + newUser.toString());
        for (User user : users) {
            System.out.println("Registered user: " + newUser.toString());
            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
               
            }
        }
        userService.save(newUser);
        return Status.SUCCESS;
    }
    
    @PostMapping("/users/login")
    public Status loginUser(@Valid @RequestBody User user) {
        List<User> users = userService.getAllUser();             //
        for (User other : users) {
            if (other.equals(user) ) {
                
               // userService.save(user);
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }
    
    
    @PostMapping("/users/logout")
    public Status logUserOut(@Valid @RequestBody User user) {
        List<User> users = userService.getAllUser();           //
        for (User other : users) {
            if (other.equals(user)) {
               
              //  userService.save(user);
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }
    
    
    
    @DeleteMapping("/users/all")
    public Status deleteUsers() {
        userService.deleteAll();
        return Status.SUCCESS;
    }
	
    @DeleteMapping("/users/{id}")
    public Status userDeleteById(@PathVariable Integer id) {
    	
    	userService.deleteById(id);
    	return Status.SUCCESS;
    	
    }
    
    
	
	

}
