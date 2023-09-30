package com.school.controller;

import java.util.ArrayList;
import java.util.List;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class DeleteMultipleTeachers {

	public static void main(String[] args) {
		
		TeacherService teacherService = new TeacherService();
		
		Teacher t1 = new Teacher();
		t1.setId(2);
		
		Teacher t2 = new Teacher();
		t2.setId(3);
		
		
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		
		teacherService.deleteMultipleTeachers(teachers);
		
		System.out.println("Deleted Successfully.........");
		System.out.println("All Good.......");
		
	}

}
