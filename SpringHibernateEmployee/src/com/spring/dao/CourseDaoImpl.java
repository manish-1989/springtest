package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.Course;

@Repository("courseDao")
@Transactional
public class CourseDaoImpl implements CourseDao {

	@Autowired
	SessionFactory sessionFactory;
	

   /* @Autowired
    public CourseDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }*/

	@Override
	public String loadCourse(int id) {
		List<Course> courseList= (List<Course>)sessionFactory.getCurrentSession().createQuery("FROM Course c  WHERE c.id="+id).list();
		// TODO Auto-generated method stub
		for(Course c:courseList){
			return (String)c.getName();
		}
		
		return "";
	}

	@Override
	public List<Course> loadCourse() {
	@SuppressWarnings("unchecked")
	List<Course> courseList= (List<Course>)sessionFactory.getCurrentSession().createCriteria(Course.class).list();
		return courseList;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> findCourse(int id) {
		// TODO Auto-generated method stub
		
		return (List<Course>)sessionFactory.getCurrentSession().get(Course.class, id);
	}

}
