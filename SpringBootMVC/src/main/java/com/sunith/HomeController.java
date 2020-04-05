package com.sunith;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.sunith.model.Alien;

@Controller
public class HomeController 
{
	@Autowired
	AlienRepo repo;
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Suhas");
	}
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getAliens")
	public String getAliens(Model m)
	{
		m.addAttribute("result",repo.findAll());
		return "showAlien";
		
	}
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int a,@RequestParam("num2") int b,ModelMap m)
//	{
//		int c=a+b;
//		
//		m.addAttribute("sum",c);
//		return "result";
//		
//	}
	
//	@RequestMapping("addAlien")
//	public String addAlien(@ModelAttribute("a1") Alien a)
//	{
////		Alien a=new Alien();
////		a.setAid(aid);
////		a.setAname(aname);
////		m.addAttribute("alien", a);
//		return "result";
//	}
}
