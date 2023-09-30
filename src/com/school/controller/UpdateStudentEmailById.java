package com.school.controller;

import com.school.service.StudentService;

public class UpdateStudentEmailById {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		boolean res = studentService.updateStudentEmailById("jackryan@mail.com", 2);
		System.out.println(res);
	
	}

}
