package com.youngkaka.appfv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	
	
	
	@RequestMapping(value="")
	public String index(){
		return "admin/index";
	}
	
	
}
