package com.online.controller;

import java.net.HttpURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.Entity.UserRegister;
import com.online.dto.UserRequestDto;
import com.online.model.ResponseMessage;
import com.online.service.IUserRegisterService;
import com.online.util.Constrants;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "User Controller", description = "APIs for managing users")
public class UserRegisterController {
	@Autowired
	private IUserRegisterService userRegisterService;
	
    @Operation(summary = "Create a new user", description = "Adds a new user to the system")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "User created successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
	@PostMapping("/userregister")
	public ResponseEntity<ResponseMessage> createRegister(@RequestBody UserRequestDto userRequestDto){
		if(userRequestDto.getEmail()==null||userRequestDto.getEmail().isEmpty()||userRequestDto.getPassword()==null||userRequestDto.getPassword().isEmpty()) {
			return ResponseEntity.status(HttpURLConnection.HTTP_BAD_REQUEST).body(new ResponseMessage(HttpURLConnection.HTTP_BAD_REQUEST, Constrants.FAILED, "Emain and Password Cannot be empty"));
		}
		
		UserRegister userRegister = userRegisterService.insertUserRegister(userRequestDto);
		
		try {
			if(userRegister!=null) {
				return ResponseEntity.status(HttpURLConnection.HTTP_CREATED).body(new ResponseMessage(HttpURLConnection.HTTP_CREATED,Constrants.SUCCESS,"User is created Successfully",userRegister));
//				return ResponseEntity.ok(new ResponseMessage(HttpURLConnection.HTTP_CREATED,Constrants.SUCCESS,"User is created Successfully",userRegister));
			}
			else {
				return ResponseEntity.status(HttpURLConnection.HTTP_BAD_REQUEST).body(new ResponseMessage(HttpURLConnection.HTTP_BAD_REQUEST,Constrants.FAILED,"User Register Failed"));
			}			
		}
		catch (Exception e) {
			e.getMessage();
			return ResponseEntity.status(HttpURLConnection.HTTP_INTERNAL_ERROR).body(new ResponseMessage(HttpURLConnection.HTTP_INTERNAL_ERROR,Constrants.FAILURE,"Internall Server Error"));
		}
		
	}
	
}

/*@PostMapping("userregister")
public ResponseEntity<ResponseMessage> createRegister(
		@RequestBody UserRegister userRegister) {
	String userMessage = userRegisterService.insertUserRegister(userRegister);
	return ResponseEntity.ok(new ResponseMessage(HttpURLConnection.HTTP_ACCEPTED, Constrants.SUCCESS, "E-Online Book is stored Successfuly",userMessage));
}*/
