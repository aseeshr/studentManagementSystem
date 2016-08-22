package com.test.serviceimpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.test.db.DBConnectionNew;
import com.test.models.Student;
import com.test.service.StudentService;

public class StudentServiceImpl implements StudentService {
	Connection con = null;

	public StudentServiceImpl() {
		con = DBConnectionNew.getDBConnection();

	}

	@Override
	public boolean addStudent(Student s) {

		String sql = "insert into student(name,dob,rollNo,faculty,semester,collegeName,gender,address,phoneNo,profilePic) values(?,?,?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setString(1, s.getName());
			pstm.setString(2, s.getDob());
			pstm.setString(3, s.getRollno());
			pstm.setString(4, s.getFaculty());
			pstm.setString(5, s.getSemester());
			pstm.setString(6, s.getCollegeName());
			pstm.setString(7, s.getGender());
			pstm.setString(8, s.getAddress());
			pstm.setLong(9, s.getPhoneNo());
			pstm.setString(10, s.getProfilePic());
			pstm.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> sList = new ArrayList<Student>();
		String sql = "select * from student";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				Student s = new Student();

				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setCollegeName(rs.getString("collegeName"));
				s.setFaculty(rs.getString("faculty"));

				// s.setAddress(rs.getString("address"));
				// s.setDob(rs.getString("dob"));
				// s.setPhoneNo(rs.getLong("phoneNo"));
				// s.setRollno(rs.getString("rollNo"));
				// s.setSemester(rs.getString("semester"));
				// s.setGender(rs.getString("gender"));
				// s.setProfilePic(rs.getString("profilePic"));
				sList.add(s);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return sList;
	}

	@Override
	public boolean deleteStudent(int id) {

		String sql = "delete from student where id = '" + id + "' ";
		try {
			Statement stm = con.createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateStudent(Student s) {
		String sql = "UPDATE student SET name=?, dob=?, rollNo=?, faculty=?, semester=?, collegeName=?, gender=?, address=?, phoneNo=? where id =?";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			pstm.setString(1, s.getName());
			pstm.setString(2, s.getDob());
			pstm.setString(3, s.getRollno());
			pstm.setString(4, s.getFaculty());
			pstm.setString(5, s.getSemester());
			pstm.setString(6, s.getCollegeName());
			pstm.setString(7, s.getGender());
			pstm.setString(8, s.getAddress());
			pstm.setLong(9, s.getPhoneNo());
			pstm.setInt(10, s.getId());
			// pstm.setString(10, s.getProfilePic());

			pstm.execute();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Student getById(int id) {

		Student s = new Student();
		String sql = "select * from student where id='" + id + "'";

		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				s.setName(rs.getString("name"));
				s.setCollegeName(rs.getString("collegeName"));
				s.setFaculty(rs.getString("faculty"));

				s.setAddress(rs.getString("address"));
				s.setDob(rs.getString("dob"));
				s.setPhoneNo(rs.getLong("phoneNo"));
				s.setRollno(rs.getString("rollNo"));
				s.setSemester(rs.getString("semester"));
				s.setGender(rs.getString("gender"));
				// s.setProfilePic(rs.getString("profilePic"));

			}
			return s;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public List<Student> searchByName(String name) {
		List<Student> sList = new ArrayList<Student>();

		String sql = "SELECT * FROM student WHERE name LIKE '%' '" + name + "' '%' ";

		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setCollegeName(rs.getString("collegeName"));
				s.setFaculty(rs.getString("faculty"));
				s.setAddress(rs.getString("address"));
				s.setDob(rs.getString("dob"));
				s.setPhoneNo(rs.getLong("phoneNo"));
				s.setRollno(rs.getString("rollNo"));
				s.setSemester(rs.getString("semester"));
				s.setGender(rs.getString("gender"));
				sList.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sList;
	}

}
