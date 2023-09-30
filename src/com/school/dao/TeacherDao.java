package com.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.school.configuration.HelperClass;
import com.school.dto.Teacher;

public class TeacherDao {

	HelperClass helperClass = new HelperClass();
	Connection connection = null;

//===================================================================================================================================

	// To save a teacher data

	public Teacher saveTeacher(Teacher teacher) {
		connection = helperClass.getConnection();
		String sql = "Insert into teacher values(?,?,?)";

		// Create Statement

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the value to delimiters/ placeholder ------> ?

			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getEmail());

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

		return teacher;

	}

//==============================================================================================================================

	// To delete a teacher

	public boolean deleteTeacherById(int id) {
		connection = helperClass.getConnection();
		String sql = "Delete from teacher where id = ?";
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

	// To Update a teacher name by using id

	public boolean updateTeacherNameById(String name, int id) {
		connection = helperClass.getConnection();
		String sql = "Update teacher set name = ? where id = ?";
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

	// To Update a teacher email by using id

	public boolean updateTeacherEmailById(String email, int id) {
		connection = helperClass.getConnection();
		String sql = "Update teacher set email = ? where id = ?";
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

	// Display teacher details for an id

	public void teacherQueryWithId(int id) {
		connection = helperClass.getConnection();
		String sql = "Select * from teacher where id = ?";

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

	// Display all the details of Teacher

	public void teacherQueryAll() {
		connection = helperClass.getConnection();
		String sql = "Select * from teacher";

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

	// To Insert multiple teacher details (Batch Operation)

	public void saveMultipleTeachers(List<Teacher> teachers) {
		connection = helperClass.getConnection();
		String sql = "Insert into teacher values(?,?,?)";
		PreparedStatement preparedStatement = null;

		for (Teacher t : teachers) {

			try {
				preparedStatement = connection.prepareStatement(sql);

				// passed the value to delimiters/ placeholder ------> ?

				preparedStatement.setInt(1, t.getId());
				preparedStatement.setString(2, t.getName());
				preparedStatement.setString(3, t.getEmail());

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

	// To delete multiple teachers (Batch Operation)

	public void deleteMultipleTeachers(List<Teacher> teachers) {
		connection = helperClass.getConnection();
		String sql = "Delete from teacher where id = ?";

		for (Teacher t : teachers) {

			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, t.getId());
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
