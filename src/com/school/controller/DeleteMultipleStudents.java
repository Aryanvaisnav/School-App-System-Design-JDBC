package com.school.controller;

import java.util.ArrayList;
import java.util.List;

import com.school.dto.Student;
import com.school.service.StudentService;

public class DeleteMultipleStudents {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		
		Student s1 = new Student();
		s1.setId(1);
		
		Student s2 = new Student();
		s2.setId(3);
		
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		
		studentService.deleteMultipleStudents(students);
		
		System.out.println("Deleted Successfully.........");
		System.out.println("All Good.......");
		
	}

}
