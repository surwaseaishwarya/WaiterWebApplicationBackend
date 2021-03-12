package com.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public interface BookingRepository extends JpaRepositoryImplementation<User, Integer>{

}
