package com.online.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.model.UserRegister;
import com.online.repository.IUserRegisterRepository;
import com.online.service.IUserRegisterService;

@Service
public class UserRegisterServiceImpl implements IUserRegisterService{

	@Autowired
	private IUserRegisterRepository userRepo;
	
	@Override
	public UserRegister insertUserRegister(UserRegister userRegister) {
		 return userRepo.save(userRegister);
	}

}
