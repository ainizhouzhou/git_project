package com.nnxy.model;

public class phh {
   
	private int id;
	private String username;
	private String password;
	private int sex;
	private String love;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public phh(int id, String username, String password, int sex, String love) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.love = love;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "phh [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", love=" + love
				+ "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
}
