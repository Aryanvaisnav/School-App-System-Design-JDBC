package com.school.controller;

import com.school.service.TeacherService;

public class UpdateTeacherEmailById {

	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.updateTeacherEmailById("adamgilchrist@gmail.com", 1);
		System.out.println(res);

	}

}
