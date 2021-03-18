package com.app.services;

import java.util.Arrays;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Booking;
import com.app.pojos.User;
import com.app.repository.UserRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	

	@Autowired
	private UserRepository userRepo;
	
	

	@Override
	public User validateLogin(String email, String password) {

      
		
		return userRepo.login(email, password);
	}
	
	
	
	

	@Override
	public User save(User user) {
             
		
		
	return userRepo.save(user);
	}
	
//
//	@Override
//	public List<User> getAllUser() {
//		
//		return userRepo.findAll();
//	}
//
//
//	@Override
//	public void deleteAll() {
//
//       userRepo.deleteAll();        System.out.println("Deleted successfully ...");
//		
//	}
//
//	@Override	public void deleteById(Integer id) {
//		
//		
//		userRepo.deleteById(id);
//		System.out.println("User Deleted by id successfully;"+id);
//		
//	}
//
//	@Override
//	public User updateUserDetails(Integer id, User user) {
//
//	User userDetails = userRepo.findById(id).get();
//		return userDetails;	}
//	
//	


}
