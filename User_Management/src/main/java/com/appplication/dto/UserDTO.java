package com.appplication.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.appplication.entity.Gender;

   
public class UserDTO {
	 
  	String username;
 	String email;
 	String password;
 	String mobile;
 	LocalDate dob;
  	Gender gender;
  	String address;
  	String dpUr;
  	LocalDateTime createAt;
  	LocalDateTime updatedAt;
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(String username, String email, String password, String mobile, LocalDate dob, Gender gender,
			String address, String dpUr, LocalDateTime createAt, LocalDateTime updatedAt) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dpUr = dpUr;
		this.createAt = createAt;
		this.updatedAt = updatedAt;
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
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "UserDTO [username=" + username + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", dpUr="
				+ dpUr + ", createAt=" + createAt + ", updatedAt=" + updatedAt + "]";
	}
 	
 	
}
