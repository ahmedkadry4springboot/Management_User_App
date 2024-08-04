package com.java.ahmed.service;

import com.java.ahmed.entity.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls user);

	public boolean checkEmail(String email);

}