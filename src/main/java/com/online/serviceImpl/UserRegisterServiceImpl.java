package com.online.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.Entity.UserRegister;
import com.online.repository.IUserRegisterRepository;
import com.online.service.IUserRegisterService;

@Service
public class UserRegisterServiceImpl implements IUserRegisterService{

	@Autowired
	private IUserRegisterRepository userRepo;
	
	@Override
	public String insertUserRegister(UserRegister userRegister) {
		 userRepo.save(userRegister);
		 return "Save Data Successfully";
	}

}
