package com.school.controller;

import com.school.service.TeacherService;

public class DeleteTeacher {

	public static void main(String[] args) {

		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.deleteTeacherById(1);
		System.out.println(res);

	}

}
