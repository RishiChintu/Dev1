package com.example.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.example.dto.LoginDto;
import com.example.dto.UpdatePasswordDto;
import com.example.dto.UpdateUserDetailsDto;
import com.example.entity.User;

public interface UserService {
	JSONObject saveUser(User user); 

	 

	List<User> getUser(); 

	 

	JSONObject verifylogin(LoginDto users); 

	 

	 

	JSONObject updateUser(UpdateUserDetailsDto user, int id); 

	 

	JSONObject updateUserPassword(UpdatePasswordDto updatePasswordDto, int id); 

	 

	User getUserById(int id); 

	 

	JSONObject delateUser(int id); 

	 

	 

	 

	} 


