package com.school.controller;

import com.school.service.StudentService;

public class UpdateStudentNameById {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		boolean res = studentService.updateStudentNameById("abc", 1);
		System.out.println(res);
	
	}

}
