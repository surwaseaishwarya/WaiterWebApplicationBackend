package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="restauran_table")
public class RestaurantTable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="table_id")
    private Long id;

    @Column(name= "table_number",length=10)
    private Integer tableNumber;

    @Column(name = "seating",length=10)
    private Integer seating;
    
    
   
//  //one to many relation ............
//    @JsonIgnoreProperties("restaurantTables")
//    @ManyToMany        
//    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//    @JoinTable(
//            name = "tables_bookings",
//            joinColumns = {@JoinColumn(name = "table_id", nullable = false, updatable = false)},
//            inverseJoinColumns = {@JoinColumn(name="booking_id", nullable = false, updatable = false)}
//    )
//    private List<Booking> bookings;
    
    
  //mappings ........
	
//    @OneToOne
//	@JoinColumn(name = "booking_id", nullable = false)
//	private Booking booking;



	public RestaurantTable() {
		super();
		// TODO Auto-generated constructor stub
	}



	public RestaurantTable(Integer tableNumber, Integer seating, Booking booking) {
		super();
		this.tableNumber = tableNumber;
		this.seating = seating;
		//this.booking = booking;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Integer getTableNumber() {
		return tableNumber;
	}



	public void setTableNumber(Integer tableNumber) {
		this.tableNumber = tableNumber;
	}



	public Integer getSeating() {
		return seating;
	}



	public void setSeating(Integer seating) {
		this.seating = seating;
	}


	
	
//
//	public Booking getBooking() {
//		return booking;
//	}
//
//
//
//	public void setBooking(Booking booking) {
//		this.booking = booking;
//	}
//    

	
	

}
