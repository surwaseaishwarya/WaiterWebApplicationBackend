package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.BookingTable;

@Repository
public interface BookingRepository extends JpaRepositoryImplementation<BookingTable, Long> {
	
	@Query(value = "SELECT * FROM bookings"
			+"WHERE customer_id in (SELECT id FROM customerProfile WHERE phone_number = :phone_number)"
			+"AND book_id in (SELECT id FROM bookings WHERE name IN :name")
	List<BookingTable> queryBy(@Param("phone_number") String phone,
            @Param("name") String name );
	
	
	

}
