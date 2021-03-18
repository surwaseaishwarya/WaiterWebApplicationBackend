package com.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.RestaurantTable;
import com.app.repository.RestaurentTablesRepository;

@Service
@Transactional
public class RestraurantTableimpl implements RestraurantTableService {

	
	@Autowired
    EntityManager entityManager;

	
	@Autowired
	private RestaurentTablesRepository restraurantTablesRepo;

	@Override
	public List<RestaurantTable> getAllTables() {

		return restraurantTablesRepo.findAll();

	}
	
	

	@Override
	public RestaurantTable getTable(Long id ) {
		Optional<RestaurantTable> tableResponse =  restraurantTablesRepo.findById(id);
		RestaurantTable table = tableResponse.get();
		return table;
	}
	
	

	@Override
	public RestaurantTable createTable(RestaurantTable table) {

		return restraurantTablesRepo.save(table);
		
		
	}

	
	

	
	
	
	
	
	
	
	
	
	
	

} 
	

	

	
	
