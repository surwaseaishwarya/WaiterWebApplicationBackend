package com.app.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Booking;
import com.app.repository.BookingRepository;

@Service
@Transactional
public class BookingServiceImpl implements BookingService  {
	
	
	@Autowired
	BookingRepository bookingRepo;
	

	@Override
	public List<Booking> getBookings() {

            return  bookingRepo.findAll();
		
		
	}


	@Override
	public Booking createBooking(Booking booking) {
		
		return bookingRepo.save(booking);
		
		
	}


	@Override
	public Booking getBookingByuserId(Long id) {
		
		 Optional<Booking> findById = bookingRepo.findById(id);
		 
		 Booking booking=findById.get();
		 return booking;
	}
	

	
	
	
	
	
	
	
	
	
	  
	

}
