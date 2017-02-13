package com.spring.dao;

import java.util.List;

import com.spring.domain.Course;


public interface CourseDao {

	public List<Course> loadCourse();
	public String loadCourse(int id);
	public List<Course> findCourse(int id);

}
