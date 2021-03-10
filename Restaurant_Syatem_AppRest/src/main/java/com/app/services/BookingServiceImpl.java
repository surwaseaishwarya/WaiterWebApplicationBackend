package com.app.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.BookingTable;
import com.app.pojos.Tables;
import com.app.repository.BookingRepository;
import com.app.repository.TablesRepository;


@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingRepository bookingRepo;
	
	@Autowired TablesRepository tablesRepo;

	@Override
	public List<BookingTable> getAllBy(String name, String phone) {

                  return bookingRepo.queryBy(name,phone);
	}

	@Override
	public void saveBooking(BookingTable booking) {

        bookingRepo.save(booking);
		
	}

	

	
//	@Override
//	public List<Tables> findAll() {
//		
//		return null;
//		
//		
//	}

	@Override
	public Tables findById(Long tid) {

          Optional<Tables> findByTableId = tablesRepo.findById(tid);
		
          Tables table=findByTableId.get();
          
          return table;
	}

@Override
public List<Tables> findAll() {
	// TODO Auto-generated method stub
	return null;
}
	
	

	

}
