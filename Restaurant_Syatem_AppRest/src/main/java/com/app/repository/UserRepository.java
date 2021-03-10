package com.app.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;


@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Long> {

}
