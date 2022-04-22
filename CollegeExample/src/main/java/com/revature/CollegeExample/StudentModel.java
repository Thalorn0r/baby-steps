package com.revature.CollegeExample;

import java.sql.Date;

public class StudentModel {
	
	public int id;
	public String firstName;
	public String lastName;
	public int age;
	public Date date;
	public String favColor;
	
	// constructor that maps the database values to variables
	public StudentModel(int id, String firstName, String lastName, int age, Date date, String fav_color) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.date = date;
		this.favColor = fav_color;
	}
	
	//this is a secret tool which will help us later
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", date=" + date + ", favColor=" + favColor + "]";
	}
	
	public StudentModel() {
		
	}

}
