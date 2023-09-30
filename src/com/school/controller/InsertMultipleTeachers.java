package com.school.controller;

import java.util.ArrayList;
import java.util.List;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class InsertMultipleTeachers {

	public static void main(String[] args) {
		
		TeacherService teacherService = new TeacherService();
		
		Teacher t1 = new Teacher();
		t1.setId(1);
		t1.setName("Emma");
		t1.setEmail("emma@mail.com");
		
		Teacher t2 = new Teacher();
		t2.setId(2);
		t2.setName("Natasha");
		t2.setEmail("natasha@mail.com");
		
		Teacher t3 = new Teacher();
		t3.setId(3);
		t3.setName("Steve");
		t3.setEmail("steve@mail.com");
		
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		teachers.add(t3);
		
		teacherService.saveMultipleTeachers(teachers);
		
		System.out.println("Inserted Successfully.........");
		System.out.println("All Good.......");
		
	}

}
