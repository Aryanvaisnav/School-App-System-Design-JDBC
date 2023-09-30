package com.school.controller;

import com.school.service.StudentService;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentService studentService = new StudentService();
		boolean res = studentService.deleteStudentById(1);
		System.out.println(res);

	}

}
