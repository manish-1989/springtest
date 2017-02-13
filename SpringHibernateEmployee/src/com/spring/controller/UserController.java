package com.spring.controller;

import java.util.Map;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.serviceimpl.SchoolService;


@Controller
public class UserController {
	
	@Autowired
	//@Resource(name="addmissionService")
	private SchoolService service;
	
	@RequestMapping("/")
	public String homePage(){
		return "index";
	}
	@RequestMapping(value="/load-home-page")
	public String loadHomePage(Map model){
		System.out.println("in load Homepage ");
		return "userindex";
	}
	
	@RequestMapping("/view-course")
	public String loadCourse(Map model, HttpServletRequest request){
		System.out.println("in load course");
		int id=0;
		if(request.getParameter("id")!=null){
			id= Integer.parseInt(request.getParameter("id"));
			model.put("courseList", service.findCourse(id));
			return "view-cource";
		}
		model.put("courseList", service.loadCourse());
		return "view-course";
		
		
	}

}
