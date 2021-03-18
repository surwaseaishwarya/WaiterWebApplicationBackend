package com.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.RestaurantTable;
import com.app.pojos.User;
import com.app.repository.RestaurentTablesRepository;


@Service
@Transactional
public interface RestraurantTableService {
	
	//1]correct
	          
	
	public List<RestaurantTable> getAllTables();

	public RestaurantTable getTable(Long id);

	
	public RestaurantTable createTable(RestaurantTable table);
	// public RestaurantTable getTableByDateTime(String date);
	
	
	
	// 2]
	
	
	         
	           
	           

	
	

	
	

	
}
