package com.dobieracz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String loginMessage(){
		return "login";
	}
        
        @RequestMapping("/")
        @ResponseBody
	public String welcomeMessage(){
		return "siemka wszystkim";
	}
}