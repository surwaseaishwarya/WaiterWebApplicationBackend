package com.app.pojos;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="user_info")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long id;
	
	
	@Column(length = 20,name="pwd",nullable = false)
	private String password;
	
	@Column(length = 40,name="name")
		private String name;
	
	
	@Column (length=10,name="phone_number",unique = true)
	private String phoneNumber;
	
	@Column(length=50,name="email",unique = true)
	private String email;
	
	// mappings ............
	@JsonIgnoreProperties(value="user")
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Booking> bookings;
	
	
	
	public User( String password, String phoneNumber, String email,
			List<Booking> bookings) {
		super();
		
		this.password = password;
		
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.bookings = bookings;
	}


	public List<Booking> getBookings() {
		return bookings;
	}


	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}


	public User() {
		super();
		System.out.println("in the user constructor .............");
	}


	public User( String password, String firstName, String lastName, String phoneNumber, String email
			) {
		super();
		
		this.password = password;
		
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
	


	public User( String password, String name, String phoneNumber, String email, List<Booking> bookings) {
		super();
	
		this.password = password;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.bookings = bookings;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", bookings=" + bookings + "]";
	}


	
	
	
	
	
	
	
	
	
}