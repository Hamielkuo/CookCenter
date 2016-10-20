package com.CookCenter.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import com.CookCenter.Entity.Customer;
import com.CookCenter.service.*;
@Controller
public class CookCenterHelloWorld {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		Customer customer=new Customer();
		service.create(customer);
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}
