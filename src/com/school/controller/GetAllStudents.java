package com.school.controller;

import com.school.service.StudentService;

public class GetAllStudents {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		studentService.studentQueryAll();
		
		
	}

}
