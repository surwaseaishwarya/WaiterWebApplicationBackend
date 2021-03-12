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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private Long id;

	@Column(name = "date")
	private LocalDate date;

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

	@JsonIgnoreProperties("bookings")
	@ManyToMany
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@JoinTable(joinColumns = {
			@JoinColumn(name = "booking_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "table_id", nullable = false, updatable = false) })
	private List<RestaurantTable> restaurantTables;

	public Booking() {
		super();
		System.out.println("in the bookings ........");
	}

	public User getUser() {
		return user;
	}

	
	
	public Booking(LocalDate date, LocalTime time, int numberInParty, String notes, String phone_number, User user) {
		super();
		this.date = date;
		this.time = time;
		this.numberInParty = numberInParty;
		this.notes = notes;
		this.phone_number = phone_number;
		this.user = user;
	}

	public Booking(LocalDate date, LocalTime time, int numberInParty, String notes, String phone_number, User user,
			List<RestaurantTable> restaurantTables) {
		super();
		this.date = date;
		this.time = time;
		this.numberInParty = numberInParty;
		this.notes = notes;
		this.phone_number = phone_number;
		this.user = user;
		this.restaurantTables = restaurantTables;
	}

	public List<RestaurantTable> getRestaurantTables() {
		return restaurantTables;
	}

	public void setRestaurantTables(List<RestaurantTable> restaurantTables) {
		this.restaurantTables = restaurantTables;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Booking(LocalDate date, LocalTime time, int numberInParty, String notes, String phone_number) {
		super();
		this.date = date;
		this.time = time;
		this.numberInParty = numberInParty;
		this.notes = notes;
		this.phone_number = phone_number;
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

	@Override
	public String toString() {
		return "Booking [id=" + id + ", date=" + date + ", time=" + time + ", numberInParty=" + numberInParty
				+ ", notes=" + notes + ", phone_number=" + phone_number + "]";
	}

}
