package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="customer_profile")
public class CustomerProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	 
	@Column(name="name",length=20)
	private String name;
	
	
	
	@Column(name="phone_number",length=10)
	private String phoneNumber;
	
	@Column(name="occupied_seats")
	private int seats;
	


	public CustomerProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CustomerProfile(String name, String phoneNumber, int seats) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.seats = seats;
		
	}



	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}


	
}
