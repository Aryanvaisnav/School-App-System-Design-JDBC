package com.school.controller;

import com.school.service.TeacherService;

public class GetTeacherById {

	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		teacherService.teacherQueryWithId(1);
	
	}

}
