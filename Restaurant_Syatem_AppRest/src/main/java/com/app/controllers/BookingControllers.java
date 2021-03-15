package com.app.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Booking;
import com.app.pojos.RestaurantTable;
import com.app.repository.BookingRepository;
import com.app.services.BookingService;

@CrossOrigin
@RestController
@RequestMapping("/bookings")
public class BookingControllers {
	
	
	  @Autowired
	  BookingRepository bookingRepo;
	  
	  @Autowired
	  BookingService bookingService;
	  
	  // create bookings........................
	  
	  
	  @PostMapping
	  public ResponseEntity<Booking> showAllBooking(@RequestBody Booking booking){
		  
		  
		        Booking createBooking = bookingService.createBooking(booking);
		        
		        return ResponseEntity.ok(createBooking);
		    
	  }
	  
	  //get all bookings  ..............
	  @GetMapping
	  
	public ResponseEntity<List<Booking>> getAllBookings(){
		  
		  
		  List<Booking> bookings = bookingService.getBookings();
		  
		  
		  return ResponseEntity.ok(bookings);
		  
	  }
	  
	  // getbookingtable by id ..........
	  
	@GetMapping(value="/{id}")
	@CrossOrigin
	public ResponseEntity<List<Booking>> GetBookingByTableId(@PathVariable Long id){
		
		 List<Booking> bookings = bookingRepo.findBookingByTableId(id);
		 
		  return ResponseEntity.ok(bookings);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
