package com.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;


@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Long> {
	
	      @Query("select u from User u where u.email=?1 and u.password=?2")
	      User login(String email,String password);

}


              
        