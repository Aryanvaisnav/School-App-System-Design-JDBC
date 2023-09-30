package com.school.service;

import java.util.List;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {

	StudentDao studentDao = new StudentDao();

//=====================================================================================================================

	public Student saveStudent(Student student) {
		Student s = studentDao.saveStudent(student);
		return s;

	}

//=====================================================================================================================

	public boolean deleteStudentById(int id) {
		boolean res = studentDao.deleteStudentById(id);
		return res;
	}

//======================================================================================================================

	public boolean updateStudentNameById(String name, int id) {
		return studentDao.updateStudentNameById(name, id);

	}

//======================================================================================================================

	public boolean updateStudentEmailById(String email, int id) {
		return studentDao.updateStudentEmailById(email, id);
	}

//======================================================================================================================

	public void studentQueryWithId(int id) {
		studentDao.studentQueryWithId(id);
	}

//======================================================================================================================

	public void studentQueryAll() {
		studentDao.studentQueryAll();
	}

//======================================================================================================================
	
	public void saveMultipleStudents(List<Student> students) {
		studentDao.saveMultipleStudents(students);
	}
	
//=======================================================================================================================
	
	public void deleteMultipleStudents(List<Student> students) {
		studentDao.deleteMultipleStudents(students);
	}
	
//========================================================================================================================
	

}
