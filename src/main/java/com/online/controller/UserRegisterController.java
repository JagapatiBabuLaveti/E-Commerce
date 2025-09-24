package com.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.model.UserRegister;
import com.online.service.IUserRegisterService;

@RestController
public class UserRegisterController {
	
	@Autowired
	private IUserRegisterService userRegisterService;
	
	public String createRegister(@RequestBody UserRegister userRegister) {
		userRegister = userRegisterService.insertUserRegister(userRegister);
		return "User Register Saved successfully with your id ::"+userRegister.getId();
	}
}
