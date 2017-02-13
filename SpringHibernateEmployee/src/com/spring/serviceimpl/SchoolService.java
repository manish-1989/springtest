package com.spring.serviceimpl;

import java.util.List;

import com.spring.domain.Course;
import com.spring.domain.Student;
import com.spring.form.StudentForm;
import com.spring.form.StudentSearchForm;


public interface SchoolService {

	public void addStudent(StudentForm studentForm);
	public List<Course> loadCourse();
	public List<Student> findStudent(StudentSearchForm studentSearchForm);
	public String loadCourse(int id);
	public StudentForm findStudent(int rollNo);
	public void updateStudent(StudentForm studentForm);
	public void deleteStudent(int rollNo);
	public List<Course> findCourse(int id);
	
}
