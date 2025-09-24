package com.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.model.UserRegister;

public interface IUserRegisterRepository extends JpaRepository<UserRegister, Long> {

}
