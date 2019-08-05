package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	//URL
	@RequestMapping("/")
	//it does not return a web page
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
}
