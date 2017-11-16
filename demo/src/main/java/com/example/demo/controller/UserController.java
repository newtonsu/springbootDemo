package com.example.demo.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CiCustomer;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired  
	Configuration configuration; //freeMarker configuration  
	
	@RequestMapping("hello")
	public String helloWorld(){
		
		return "hello World";
	}
	

	@RequestMapping("getUserInfo")
	public String  getUserInfo(Model model) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException{
		
		User user = new User();
		user.setUserName("贾维国");
		List<Map<String,Object>> list = userService.getUser(user);
		model.addAttribute("userList", list);  
		return "index";
	}
}
