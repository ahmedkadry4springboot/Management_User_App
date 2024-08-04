package com.java.ahmed.service.Imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.java.ahmed.entity.UserDtls;
import com.java.ahmed.repository.UserRepository;
import com.java.ahmed.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
	private UserRepository userRepo;

    
	@Autowired
	private BCryptPasswordEncoder passwordEncode;


    @Override
    public UserDtls createUser(UserDtls user) {
        user.setPassword(passwordEncode.encode(user.getPassword()));
        user.setRole("ROLE_USER");
		return userRepo.save(user);
    }

    @Override
    public boolean checkEmail(String email) {
        return userRepo.existsByEmail(email);
    }
    
}
