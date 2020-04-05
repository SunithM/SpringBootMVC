package com.sunith;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		m.addAttribute("name","Above values added succesfully");
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
	@GetMapping("getOne")
	public String getAlien(@RequestParam int aid,Model m)
	{
		m.addAttribute("result",repo.getOne(aid));
		return"showAlien";
	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a)
	{
		repo.save(a);
		return "result";
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
