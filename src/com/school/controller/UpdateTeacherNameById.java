package com.school.controller;

import com.school.service.TeacherService;

public class UpdateTeacherNameById {

	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		boolean res = teacherService.updateTeacherNameById("abc", 1);
		System.out.println(res);

	}

}
