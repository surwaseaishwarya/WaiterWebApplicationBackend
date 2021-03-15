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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name = "bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private Long id;

	@JsonFormat(pattern = "yyyy-MM-dd",shape=Shape.STRING)
	@Column(name = "date")
	private LocalDate date;

	
	@JsonFormat(pattern = "hh:mm:ss a")
	@Column(name = "time")
	private LocalTime time;

	@Column(name = "number_in_party", length = 5)
	private int numberInParty;

	@Column(name = "notes", length = 60)
	private String notes;

	@Column(name = "phone_number", length = 10, unique = true)
	private String phone_number;

	
	
	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	
	
//	@JsonIgnoreProperties("bookings")
//	@ManyToMany             //booking inversisde
//	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
//	@JoinTable(joinColumns = {
//			@JoinColumn(name = "booking_id", nullable = false, updatable = false) }, inverseJoinColumns = {
//					@JoinColumn(name = "table_id", nullable = false, updatable = false) })
//	private List<RestaurantTable> restaurantTables;
	
	
	
	@OneToOne
	@JoinColumn(name = "table_id", nullable = false)
	private RestaurantTable restaurantTable;



	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Booking(LocalDate date, LocalTime time, int numberInParty, String notes, String phone_number, User user,
			RestaurantTable restaurantTable) {
		super();
		this.date = date;
		this.time = time;
		this.numberInParty = numberInParty;
		this.notes = notes;
		this.phone_number = phone_number;
		this.user = user;
		this.restaurantTable = restaurantTable;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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



	public int getNumberInParty() {
		return numberInParty;
	}



	public void setNumberInParty(int numberInParty) {
		this.numberInParty = numberInParty;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public String getPhone_number() {
		return phone_number;
	}



	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public RestaurantTable getRestaurantTable() {
		return restaurantTable;
	}



	public void setRestaurantTable(RestaurantTable restaurantTable) {
		this.restaurantTable = restaurantTable;
	}
	
	
	
	
	

}
