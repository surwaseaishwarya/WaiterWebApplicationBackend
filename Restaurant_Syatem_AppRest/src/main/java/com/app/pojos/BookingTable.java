package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class BookingTable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="book_id")
	private Integer bid;
	
	
	@Column(name="customer_id")
	private Integer cid;
	
	
	@Column(name="table_id")
	private Integer tid;
	
	
	@OneToOne
	@JoinColumn(name = "book_id", insertable = false, updatable = false)
	private Tables table;

	@OneToOne
	@JoinColumn(name = "customer_id", insertable = false, updatable = false)
	private CustomerProfile customer;
	
	

}
