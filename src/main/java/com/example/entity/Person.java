package com.example.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	private String name;
	private String date;
	
	

	public Person(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}

	public Person() {
		super();
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	
	
	
}
