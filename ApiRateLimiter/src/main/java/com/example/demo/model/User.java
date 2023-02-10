package com.example.demo.model;

import java.sql.Date;

public class User {

	private Integer id;
	private String name;
	private String gender;
	private Date date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User(Integer id, String name, String gender, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.date = date;
	}
	
	
	
}
