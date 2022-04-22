package com.revature.CollegeExample;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
	
	//creates an instance of our getConnection method from the ConnectionManager
	private Connection conn = ConnectionManager.getConnection();
	
	//returns all students
	public ArrayList<StudentModel> getAllStudents() {
		
		try {
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM Student");
			ArrayList<StudentModel> students = new ArrayList<StudentModel>();
			
			//map result set to StudentModel array list
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int age = rs.getInt("age");
				Date date = rs.getDate("birthday");
				String favColor = rs.getString("fav_color");
				
				students.add(new StudentModel(id, firstName, lastName, age, date, favColor));
			} return students;
		} catch (SQLException e) {
			e.printStackTrace();
			
		} return null;
		
	}
	
	public void addStudent(StudentModel newStudent) {
		try {
			String query = "INSERT into Student (firstName, lastName, age, birthday, fav_color) values (?, ?, ?, ?, ?)";
			//creates a prepared statement to run the query through the connection
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, newStudent.firstName);
			pstmt.setString(2, newStudent.lastName);
			pstmt.setInt(3, newStudent.age);
			pstmt.setDate(4, newStudent.date);
			pstmt.setString(5, newStudent.favColor);
			// .execute is used for non-select queries where a return is not expected
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
