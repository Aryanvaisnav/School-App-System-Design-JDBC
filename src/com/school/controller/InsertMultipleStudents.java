package com.school.controller;

import java.util.ArrayList;
import java.util.List;

import com.school.dto.Student;
import com.school.service.StudentService;

public class InsertMultipleStudents {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Jack");
		s1.setEmail("jack@mail.com");
		
		Student s2 = new Student();
		s2.setId(2);
		s2.setName("Cooper");
		s2.setEmail("cooper@mail.com");
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Ken");
		s3.setEmail("ken@mail.com");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		studentService.saveMultipleStudents(students);
		
		System.out.println("Inserted Successfully.........");
		System.out.println("All Good.......");
		
	}

}
