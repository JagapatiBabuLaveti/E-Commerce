package com.online.serviceImpl;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.Entity.UserRegister;
import com.online.dto.UserRequestDto;
import com.online.repository.IUserRegisterRepository;
import com.online.service.IUserRegisterService;

@Service
public class UserRegisterServiceImpl implements IUserRegisterService{

	@Autowired
	private IUserRegisterRepository userRepo;

	@Override
	public UserRegister insertUserRegister(UserRequestDto userRequestDto) {
		UserRegister userRegister = new UserRegister();
		try {
			userRegister.setName(userRequestDto.getName());
			userRegister.setEmail(userRequestDto.getEmail());
			userRegister.setContactId(userRequestDto.getContactId());
			userRegister.setPassword(Base64.getEncoder().encodeToString(userRequestDto.getPassword().getBytes()));
			userRepo.save(userRegister);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return userRegister;
	}

}
