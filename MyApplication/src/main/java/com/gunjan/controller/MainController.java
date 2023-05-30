package com.gunjan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		
		return "hello world";
	}
	
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcomePage";
	}
	
	@RequestMapping("/home")
	public ModelAndView home() {
		
		List<Integer> list= new ArrayList<>(); 
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//String st = "I am gunjan";
		
		ModelAndView mv= new ModelAndView();
		mv.addObject("data", list);
		mv.setViewName("home");
		return mv;
	}

}
