package com.app.pojos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="restauran_table")
public class RestaurantTable {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private Long id;

    @Column(name= "table_number",length=10)
    private int tableNumber;

    @Column(name = "seating",length=10)
    private int seating;
    
    
    
    @Column(name="date")
    private LocalDate date;
    
    
    @Column(name="time")
    private LocalTime time;
    

    @JsonIgnoreProperties("restaurantTables")
    @ManyToMany        //one to many relation ............
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "tables_bookings",
            joinColumns = {@JoinColumn(name = "table_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name="booking_id", nullable = false, updatable = false)}
    )
    private List<Booking> bookings;


	public RestaurantTable() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public RestaurantTable(int tableNumber, int seating, LocalDate date, LocalTime time, List<Booking> bookings) {
		super();
		this.tableNumber = tableNumber;
		this.seating = seating;
		this.date = date;
		this.time = time;
		this.bookings = bookings;
	}





	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public int getTableNumber() {
		return tableNumber;
	}


	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}


	public int getSeating() {
		return seating;
	}


	public void setSeating(int seating) {
		this.seating = seating;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
    
    
    
    
	

}
