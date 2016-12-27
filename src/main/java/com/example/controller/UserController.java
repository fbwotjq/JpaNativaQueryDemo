package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.User;
import com.example.service.UserService;

@Controller
public class UserController {

	@Autowired UserService userService;
	
	@RequestMapping(value="/getUser")
	@ResponseBody public User getUser(long id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(value="/modifyUser")
	@ResponseBody public Map<String, String> modifyUser(long id) {
		userService.modifyUser(id);
		Map<String, String> result = new HashMap<>();
		result.put("code", "200");
		result.put("message", "success");
		return result;
	}
	
}
