package com.gunjan.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gunjan.model.Parts;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Listcontroller {
	
	private List<Parts> listParts;
	
	@ResponseBody
	@RequestMapping("/load")
	public String list() {
		
		return "I am List Controller method";
	}
	
	@PostConstruct
	@RequestMapping("/list")
	public ModelAndView loadList() {
		
		Parts p1 = new Parts(1, "0123a", "I am part one", true, false);
		Parts p2 = new Parts(2, "0a125", "I am part two", true,false);
		Parts p3 = new Parts(3, "1012d", "I am part three", false,false);
		Parts p4 = new Parts(4, "2087y", "I am part four", false,false);
		Parts p5 = new Parts(5, "3082t", "I am part five", true,false);

		listParts = new ArrayList<>();

		listParts.add(p1);
		listParts.add(p2);
		listParts.add(p3);
		listParts.add(p4);
		listParts.add(p5);
		
		
		//String st = "I am gunjan";
		System.out.println(listParts);
		
		ModelAndView mv= new ModelAndView();
		List<Parts> listParts1 = new ArrayList<>(listParts);
		mv.addObject("parts", listParts1);
		mv.setViewName("loadList");
		return mv;
	}
	
	
	@RequestMapping(path = "/selected", method = RequestMethod.POST)
	public ModelAndView loadSelected(HttpServletRequest request) {
		
	  
		String[] checkArr = request.getParameterValues("checks");
		//String[] arr = request.getParameterValues("ind");
		
		for(int i=0;i<checkArr.length;i++) {
			System.out.print(checkArr[i]+" hii"+"   ");
			}
		
		System.out.println();
		
//        for(int i=0;i<checkArr.length;i++) {
//			
//			int x =Integer.parseInt(checkArr[i]) ;
//		   
//		  listParts.get(x).setChecklist(true);
//			
//		}
		
		
//		for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+" hii"+"   ");
//		}
//		int[] checkArr = new int[arr.length];
//		System.out.println(arr.length);
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			checkArr[i] = Integer.parseInt(arr[i]);
//		}
//		
//		System.out.println(arr);
//		System.out.println(checkArr);
//		//boolean[] checkArr = Boolean.parseBoolean();
//		 
		
		int[] intChecks = new int[checkArr.length];
		
		
		for(int i=0;i<checkArr.length;i++) {
			
			intChecks[i] = Integer.parseInt(checkArr[i]);
		}
		
		List<Integer> listCheck = Arrays.stream(intChecks).boxed().collect(Collectors.toList());
		
		for(Integer i=0;i<listParts.size();i++) {
			
			if(listCheck.contains(i)) {
				 listParts.get(i).setChecklist(true);
			}
			else {
				 listParts.get(i).setChecklist(false);
			}
		}
		
		
		
		System.out.println(listParts);
		
		ModelAndView mdv = new ModelAndView();
		mdv.addObject("lparts", listParts);
		mdv.setViewName("selectedList");		
		
		return mdv;
	}

}
