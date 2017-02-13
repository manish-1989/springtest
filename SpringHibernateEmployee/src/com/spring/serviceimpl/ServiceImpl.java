package com.spring.serviceimpl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.CourseDao;
import com.spring.dao.StudentDao;
import com.spring.domain.Course;
import com.spring.domain.Student;
import com.spring.form.StudentForm;
import com.spring.form.StudentSearchForm;




@Service("addmissionService")
public class ServiceImpl implements SchoolService {
	@Autowired
	private StudentDao studentDao;
    @Autowired
	private CourseDao courseDao;
	@Override
	public String loadCourse(int id) {
		// TODO Auto-generated method stub
		return courseDao.loadCourse(id);
	}

	@Override
	public void deleteStudent(int rollNo) {
		// TODO Auto-generated method stub
          studentDao.deleteStudent(rollNo);
	}

	@Override
	public void addStudent(StudentForm studentForm) {
		Timestamp time = new Timestamp(System.currentTimeMillis());		

		Student student = new Student();
		//student.setRollNo(studentForm.getRollNo());
		student.setName(studentForm.getName());
		student.setCourse(studentForm.getCourse());
		student.setAddress(studentForm.getAddress());
		student.setPhoneNo(studentForm.getPhoneNo());
		student.setAddmissionDate(time);
		 studentDao.addStudent(student);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> loadCourse() {
		// TODO Auto-generated method stub
		return  courseDao.loadCourse();
	}

	@Override
	public List<Student> findStudent(StudentSearchForm studentSearchForm) {

		// TODO Auto-generated method stub
		return studentDao.findStudent(studentSearchForm);
	}

	@Override
	public StudentForm findStudent(int rollNo) {
		// TODO Auto-generated method stub
		Student student = studentDao.findStudent(rollNo);
		StudentForm studentForm = new StudentForm();

		studentForm.setRollNo(student.getRollNo());
		studentForm.setName(student.getName());
		studentForm.setCourse(student.getCourse());
		studentForm.setAddress(student.getAddress());
		studentForm.setPhoneNo(student.getPhoneNo());

		return studentForm;

	}

	@Override
	public void updateStudent(StudentForm studentForm) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setRollNo(studentForm.getRollNo());
		student.setName(studentForm.getName());
		student.setCourse(studentForm.getCourse());
		student.setAddress(studentForm.getAddress());
		student.setPhoneNo(studentForm.getPhoneNo());
		//student.setAdmissinDate(time);
		studentDao.updateStudent(student);
		
	}

	@Override
	public List<Course> findCourse(int id) {
		// TODO Auto-generated method stub
		return courseDao.findCourse(id);
	}


}
