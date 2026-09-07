package com.appplication.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Long id;
	@Column(nullable=false, length = 100)
	private  String username;
	@Column(nullable=false, unique= true, length = 100)
	private  String email;
	@Column(nullable=false)
	private  String password;
	@Column(nullable=false)
	private  String mobile;
	@Column(nullable=false)
	private  LocalDate dob;
	
 	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private Gender gender;
 	
 	@Column(nullable=false)
	private  String address;
 	
 	@Column(nullable=false)
	private  String dpUr;
 	
 	@CreatedDate
 	@Column(name = "created_at", nullable = false, updatable = false) // Force exact DB column name
 	private LocalDateTime createdAt;

 	@LastModifiedDate
 	@Column(name = "updated_at") // Force exact DB column name
 	private LocalDateTime updatedAt;
 	
 	@PrePersist
 	public void onCreate() {
 	    createdAt = LocalDateTime.now();
 	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String email, String password, String mobile, LocalDate dob, Gender gender,
			String address, String dpUr, LocalDateTime createdAt, LocalDateTime  updatedAt) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dpUr = dpUr;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDpUr() {
		return dpUr;
	}
	public void setDpUr(String dpUr) {
		this.dpUr = dpUr;
	}
	public LocalDateTime  getCreateAt() {
		return createdAt;
	}
	public void setCreateAt(LocalDateTime  createAt) {
		this.createdAt = createAt;
	}
	public LocalDateTime  getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime  updatedAt) {
		this.updatedAt = updatedAt;
	}
	 
	
}
