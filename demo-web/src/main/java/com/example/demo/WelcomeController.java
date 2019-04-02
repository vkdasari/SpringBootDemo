package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	@RequestMapping("welcomeUser")
	public ModelAndView welcome(@RequestParam("name") String userName) 
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("Welcome "+userName);
		mv.addObject("name", userName);
		mv.setViewName("welcome");
		return mv;
	} 
	
	@RequestMapping("studentAdition")
	public ModelAndView stuAdd(Student stu)
	{
		ModelAndView mv = new ModelAndView();
		System.out.println(stu);
		mv.addObject("obj",stu);
		mv.setViewName("students");
		return mv;
	} 
	
	@RequestMapping("studentAditionTemp")
	public void stuAddTemp(
			@RequestParam("roll") String rollNumber, 
			@RequestParam("name") String stuName, 
			@RequestParam("age") String stuAge) 
	{
		ModelAndView mv = new ModelAndView();
		System.out.println("Student:  "+rollNumber+" "+stuName+" "+stuAge);
		
	} 
	

}
