package com.app.services;

import java.util.List;

import com.app.pojos.BookingTable;
import com.app.pojos.Tables;

public interface BookingService {
	
	
	Tables findById(Long tid);
	public List<BookingTable> getAllBy(String name,String phone);
	
	public void saveBooking(BookingTable booking);
	
	List<Tables> findAll();
	

}
