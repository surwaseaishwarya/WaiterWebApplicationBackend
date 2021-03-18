package com.app.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Booking;
import com.app.pojos.RestaurantTable;

@Service 
@Transactional
public interface BookingService {
	
	
	
	public List<Booking> getBookings();
	
	
	public Booking createBooking(Booking booking);


	public Booking getBookingByuserId(Long id);


	
	public void deleteById(Long id);
	
	
	
	

}



