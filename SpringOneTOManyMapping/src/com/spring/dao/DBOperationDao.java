package com.spring.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Category;
import com.spring.model.Product;

@Repository("courseDao")
@Transactional
public class DBOperationDao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void addProduct(Product product){
		sessionFactory.getCurrentSession().saveOrUpdate(product);
	}

	public void addCategory(Category category){
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
	}
	
	public List<Product> getProductData(){
		List<Product> prodList= sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		System.out.println("product list=="+ prodList);
		return prodList;
	}
	public List<Category> getCategoryData(){
		List<Category> prodList= sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		System.out.println("category list=="+ prodList);
		return prodList;
	}


}
