package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class InsertTeacher {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Adam");
		teacher.setEmail("adam@mail.com");
		
		TeacherService teacherService = new TeacherService();
		Teacher t = teacherService.saveTeacher(teacher);
		
		if(t!= null) {
			System.out.println(t.getId() + " saved successfully");
		}
		

	}

}
