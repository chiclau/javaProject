package com.liu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class MyController {

	
		
		@RequestMapping("/mvc")
		public String name() {
			System.out.println("asd");
			
			return "../home.jsp";
		}

}
