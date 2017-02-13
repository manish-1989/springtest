package com.spring.dao;

import java.util.List;

import com.spring.domain.Student;
import com.spring.form.StudentSearchForm;


public interface StudentDao {
	public void addStudent(Student student);
	public List<Student> findStudent(StudentSearchForm studentSearchForm);
	public Student findStudent(int rollNo);
	public void updateStudent(Student student);
	public void deleteStudent(int rollNo);

}
