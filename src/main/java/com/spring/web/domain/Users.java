package com.spring.web.domain;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {

	private static final long serialVersionUID = 3287734021452355760L;
	private String username;
	private String password;
	private List<String> role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}

}
