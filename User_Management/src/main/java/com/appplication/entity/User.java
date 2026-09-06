package com.appplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class User {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	@Column(nullable=false)
	String username;
	@Column(nullable=false, unique= true)
	String email;
	@Column(nullable=false)
	String password;
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	Enum role;
	@Column(nullable=false)
	String createAt;
	@Column(nullable=false)
	String updatedAt;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String email, String password, Enum role, String createAt, String updatedAt) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
		this.createAt = createAt;
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
	public Enum getRole() {
		return role;
	}
	public void setRole(Enum role) {
		this.role = role;
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
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", role="
				+ role + ", createAt=" + createAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
}
