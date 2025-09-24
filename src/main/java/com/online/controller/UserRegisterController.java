package com.online.controller;

import java.net.HttpURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.Entity.UserRegister;
import com.online.model.ResponseMessage;
import com.online.service.IUserRegisterService;
import com.online.util.Constrants;

@RestController
public class UserRegisterController {
	@Autowired
	private IUserRegisterService userRegisterService;
	
	@PostMapping("userregister")
	public ResponseEntity<ResponseMessage> createRegister(
			@RequestBody UserRegister userRegister) {
		String userMessage = userRegisterService.insertUserRegister(userRegister);
		return ResponseEntity.ok(new ResponseMessage(HttpURLConnection.HTTP_ACCEPTED, Constrants.SUCCESS, "E-Online Book is stored Successfuly",userMessage));
	}
}
