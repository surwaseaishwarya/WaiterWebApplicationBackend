package com.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.RestaurantTable;
import com.app.repository.RestaurentTablesRepository;
import com.app.services.RestraurantTableService;
import com.app.services.UserService;

@CrossOrigin
@RestController
@RequestMapping

public class RestaurentTableControllers {
	
	
	 @Autowired
	    RestraurantTableService restraurentService;
	
         @Autowired
         RestaurentTablesRepository restraurantTablesRepo;

	 // get all tables ......
         
	    @GetMapping(value = "/restaurant_tables")
	    @CrossOrigin
	    public ResponseEntity<List<RestaurantTable>> getAllRestaurantTables() {
	    	List<RestaurantTable> restaurantTables=restraurentService.getAllTables();
	       boolean available;
	    			if(restaurantTables==null) {

	    				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    			}
	    		return ResponseEntity.ok(restaurantTables);	
	    }

	    
       // get table by id 
	    
   @GetMapping(value="/restaurant_tables/tableid/{id}")
    public RestaurantTable getTableById(@PathVariable Long id) {
	    	
	    	return restraurentService.getTable(id);
	    	
	    }
	    
	    
   
	    // get table by seating ..............
	    
	    @GetMapping(value="/restaurant_tables/{number}")
	    
	    public List<RestaurantTable> getTablesByseating(@PathVariable Integer number){
	    	return restraurantTablesRepo.findTablesBySeating(number);
	    }
	    
	    
         
	   
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	

}
