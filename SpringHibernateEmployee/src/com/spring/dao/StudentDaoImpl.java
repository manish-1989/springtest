package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Student;
import com.spring.form.StudentSearchForm;
@Repository("studentDao")
@Transactional
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;


   /* @Autowired
    public StudentDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }*/

	@Override
	public void deleteStudent(int rollNo) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Student s WHERE s.rollNo="+rollNo).executeUpdate();
		// TODO Auto-generated method stub
		

	}
	@Override
	public void addStudent(Student student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
	}
	@Override
	public List<Student> findStudent(StudentSearchForm studentSearchForm) {
		// TODO Auto-generated method stub
		
		String sql="FROM Student s";
		String where="";
		if(!studentSearchForm.getName().equals("")){
			if(where.equals("")){
			where= "WHERE s.name like '%"+studentSearchForm.getName()+"%'";
		
			}
			else{
				where= where+" and s.name like '%"+studentSearchForm.getName()+"%'";
			}
			}
		if(studentSearchForm.getPhoneNo()!=null){
			if(where.equals("")){
				where="WHERE s.phoneNo="+studentSearchForm.getPhoneNo();
			}
			else{
				where= where+" and s.phoneNo="+studentSearchForm.getPhoneNo();
			}
		}
		if(studentSearchForm.getRollNo() != null){
			if(where.equals("")){
				where = "WHERE s.rollNo ="+studentSearchForm.getRollNo();
			}else{
				where = where +" and s.rollNo ="+studentSearchForm.getRollNo();
			}
		}
		return (List<Student>)sessionFactory.getCurrentSession().createQuery(sql + where + " ORDER BY s.rollNo DESC").list();
	
		
		
		
			}
	@Override
	public Student findStudent(int rollNo) {
		return (Student)sessionFactory.getCurrentSession().get(Student.class, rollNo);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		
	}

}
