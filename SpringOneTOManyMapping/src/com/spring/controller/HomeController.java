package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Category;
import com.spring.model.Product;
import com.spring.service.DBService;

@Controller
public class HomeController {
	@Autowired
	DBService service;
	@RequestMapping("/")
	public String welcome(ModelMap map){
		map.put("productObj", new Product());
		map.put("categoryObj", new Category());
		return "index";
	}
	
	
	@RequestMapping("/addproduct")
 public String addProduct(@ModelAttribute("product") Product p){
		service.addProducts(p);
	 return null;
 }
	
	@RequestMapping("/getCategory")
	 public void getCategory(){
		List<Category> list=service.getCategoryData();
		System.out.println("controller cat datass="+list);
	 
 }
	@RequestMapping("/getProduct")
	 public String getproducts(){
		List<Product> list=service.getProductData();
		System.out.println("controller prod datass="+list);
	 return null;
}
	@RequestMapping("/addCategory")
	 public String addCategory(@ModelAttribute("category") Category p){
		service.addCategory(p);
	 return null;
}
}
