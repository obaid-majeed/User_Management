package com.appplication.dto;

import java.time.LocalDate;

import com.appplication.entity.Gender;

public class UserResponseDto {

  	String username;
 	String email;
  	String mobile;
 	LocalDate dob;
  	Gender gender;
  	String address;
  	String dpUr;
  	String createAt;
 	String updatedAt;
	public UserResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserResponseDto(String username, String email, String mobile, LocalDate dob, Gender gender, String address,
			String dpUr, String createAt, String updatedAt) {
		super();
		this.username = username;
		this.email = email;
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
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "UserResponseDto [username=" + username + ", email=" + email + ", mobile=" + mobile + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + ", dpUr=" + dpUr + ", createAt=" + createAt
				+ ", updatedAt=" + updatedAt + "]";
	}
 	
 	
 	
}
