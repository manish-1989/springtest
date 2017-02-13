package com.spring.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.DBOperationDao;
import com.spring.model.Category;
import com.spring.model.Product;

@Service("dataservice")
public class DBService {
	
	@Autowired
	DBOperationDao dao;
	
	public void addProducts(Product product){
		dao.addProduct(product);
	}
	
	public void addCategory(Category category){
		dao.addCategory(category);
	}
	
	public List<Product> getProductData(){
		List<Product> list=dao.getProductData();
		System.out.println("service list of prod"+list);
		return list;
	}
     public List<Category> getCategoryData(){
    	 List<Category> list=dao.getCategoryData();
    	 System.out.println("service list of cate"+list);
    	 return list;
	}
	}
