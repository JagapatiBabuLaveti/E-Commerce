package com.online.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.Entity.UserRegister;

public interface IUserRegisterRepository extends JpaRepository<UserRegister, Long> {

}
