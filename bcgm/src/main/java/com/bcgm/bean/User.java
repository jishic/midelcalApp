package com.bcgm.bean;
public class User {
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [Username=" + username + ", password=" + password + "]";
	}
	
	
}
