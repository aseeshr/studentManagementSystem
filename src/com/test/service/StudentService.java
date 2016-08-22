package com.test.service;

import java.util.List;

import com.test.models.Student;

public interface StudentService {

	public boolean addStudent(Student s);

	public List<Student> getStudents();

	public boolean deleteStudent(int id);

	public boolean updateStudent(Student s);

	public Student getById(int id);

	public List<Student> searchByName(String name);
}
