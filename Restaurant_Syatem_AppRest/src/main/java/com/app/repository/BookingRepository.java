package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.app.pojos.Booking;
import com.app.pojos.RestaurantTable;
import com.app.pojos.User;

@Repository
public interface BookingRepository extends JpaRepositoryImplementation<Booking, Long>{

	
	@Query(value = "SELECT * FROM bookings b WHERE b.table_id=:id and b.date>=CURRENT_DATE", nativeQuery = true)
	  List<Booking> findBookingByTableId(Long id);
	
	
	
	
	
	
}
