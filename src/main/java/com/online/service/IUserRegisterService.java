package com.online.service;

import com.online.Entity.UserRegister;
import com.online.dto.UserRequestDto;

public interface IUserRegisterService {

	UserRegister insertUserRegister(UserRequestDto userRequestDto);
}
