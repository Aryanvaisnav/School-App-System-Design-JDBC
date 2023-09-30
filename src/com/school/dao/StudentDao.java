package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.school.configuration.HelperClass;
import com.school.dto.Student;

public class StudentDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

//===================================================================================================================================

	// To save a student data

	public Student saveStudent(Student student) {
		connection = helperClass.getConnection();
		String sql = "Insert into student values(?,?,?)";

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the value to delimiters/ placeholder ------> ?

			preparedStatement.setInt(1, student.getId());
			preparedStatement.setString(2, student.getName());
			preparedStatement.setString(3, student.getEmail());

			// execute
			preparedStatement.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return student;

	}

//==============================================================================================================================

	// To delete a student

	public boolean deleteStudentById(int id) {
		connection = helperClass.getConnection();
		String sql = "Delete from student where id = ?";
		int i = 0;

		// establish the statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, id);

			i = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close Connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//===============================================================================================================================================

	// To Update a student name by using id

	public boolean updateStudentNameById(String name, int id) {
		connection = helperClass.getConnection();
		String sql = "Update student set name = ? where id = ?";
		int i = 0;

		// establish the statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, id);
			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//========================================================================================================================================

	// To Update a student email by using id

	public boolean updateStudentEmailById(String email, int id) {
		connection = helperClass.getConnection();
		String sql = "Update student set email = ? where id = ?";
		int i = 0;

		// establish the statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setInt(2, id);
			i = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection

			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (i > 0) {
			return true;
		} else {
			return false;
		}

	}

//===========================================================================================================================================================

	// Display student details for an id

	public void studentQueryWithId(int id) {
		connection = helperClass.getConnection();
		String sql = "Select * from student where id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("==========================================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//========================================================================================================================================

	// Display all the details of Student

	public void studentQueryAll() {
		connection = helperClass.getConnection();
		String sql = "Select * from student";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("==========================================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// Close the connection
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//=============================================================================================================================

	// To Insert multiple student details (Batch Operation)

	public void saveMultipleStudents(List<Student> students) {
		connection = helperClass.getConnection();
		String sql = "Insert into student values(?,?,?)";
		PreparedStatement preparedStatement = null;

		for (Student s : students) {

			try {
				preparedStatement = connection.prepareStatement(sql);

				// passed the value to delimiters/ placeholder ------> ?

				preparedStatement.setInt(1, s.getId());
				preparedStatement.setString(2, s.getName());
				preparedStatement.setString(3, s.getEmail());

				// execute

				preparedStatement.addBatch();
				preparedStatement.executeBatch();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// Close connection
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//===================================================================================================================================

	// To delete multiple students (Batch Operation)

	public void deleteMultipleStudents(List<Student> students) {
		connection = helperClass.getConnection();
		String sql = "Delete from student where id = ?";

		for (Student s : students) {

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, s.getId());
				preparedStatement.addBatch();
				preparedStatement.executeBatch();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		// Close Connection
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//===========================================================================================================================================================

}
