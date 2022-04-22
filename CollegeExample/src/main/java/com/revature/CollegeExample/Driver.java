package com.revature.CollegeExample;

import java.sql.Date;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		StudentDAO studentDAO = new StudentDAO();
		//student.getAllStudents();
		//System.out.println(studentDAO.getAllStudents());
		
		studentDAO.addStudent(new StudentModel(0, "Albus", "Dumbledore", 150, Date.valueOf("1872-04-20"), "green"));
		
		ArrayList<StudentModel> students = studentDAO.getAllStudents();
		for (StudentModel i: students) {
			System.out.println(i);
		}
		

	}

}
