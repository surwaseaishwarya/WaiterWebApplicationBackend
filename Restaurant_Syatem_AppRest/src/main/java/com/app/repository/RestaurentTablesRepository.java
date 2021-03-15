package com.app.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.RestaurantTable;
import com.app.pojos.User;

@Repository
public interface RestaurentTablesRepository extends JpaRepositoryImplementation<RestaurantTable,Long> {

	@Query("select t from RestaurantTable t where t.seating =:s")
	List<RestaurantTable> findTablesBySeating(Integer s);
	
	
	
	
//	@Query("select t from Booking b , tables_bookings s where b.booking_id=s.booking_id and s.table_no=:l ")
//	List<RestaurantTable> getTablesAvailable(Integer l);
	
	
	
	
	

	
}

