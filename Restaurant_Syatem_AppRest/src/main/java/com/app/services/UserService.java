package com.app.services;

import java.util.List;

import com.app.pojos.User;


public interface UserService {
	
	
	public User save(User user);
	
	
//	public List<User> getAllUser();
//	public void deleteAll();
//	
//	public void deleteById(Integer id);
//	public User updateUserDetails(Integer id, User user);
//	
	
	User validateLogin(String email,String password);
	

}
