package com.appplication.dto;

 
public class UserDTO {
	Long id;
	
	String username;
	
	String email;
	
	String password;
	
 	Enum role;
	
	String createAt;
	
	String updatedAt;

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDTO(String username, String email, String password, Enum role, String createAt, String updatedAt) {
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
		return "UserDTO [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", role=" + role + ", createAt=" + createAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
}
