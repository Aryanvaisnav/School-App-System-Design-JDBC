package com.school.service;

import java.util.List;

import com.school.dao.TeacherDao;
import com.school.dto.Teacher;

public class TeacherService {

	TeacherDao teacherDao = new TeacherDao();

//=====================================================================================================================

	public Teacher saveTeacher(Teacher teacher) {
		Teacher s = teacherDao.saveTeacher(teacher);
		return s;

	}

//=====================================================================================================================

	public boolean deleteTeacherById(int id) {
		boolean res = teacherDao.deleteTeacherById(id);
		return res;
	}

//======================================================================================================================

	public boolean updateTeacherNameById(String name, int id) {
		return teacherDao.updateTeacherNameById(name, id);

	}

//======================================================================================================================

	public boolean updateTeacherEmailById(String email, int id) {
		return teacherDao.updateTeacherEmailById(email, id);
	}

//======================================================================================================================

	public void teacherQueryWithId(int id) {
		teacherDao.teacherQueryWithId(id);
	}

//======================================================================================================================

	public void teacherQueryAll() {
		teacherDao.teacherQueryAll();
	}

//======================================================================================================================

	public void saveMultipleTeachers(List<Teacher> teachers) {
		teacherDao.saveMultipleTeachers(teachers);
	}

//=======================================================================================================================

	public void deleteMultipleTeachers(List<Teacher> teachers) {
		teacherDao.deleteMultipleTeachers(teachers);
	}

//========================================================================================================================

}
