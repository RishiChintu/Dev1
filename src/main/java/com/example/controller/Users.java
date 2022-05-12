package com.example.controller;

import org.json.simple.JSONObject; 

import java.util.List; 

 

import org.springframework.beans.factory.annotation.Autowired; 

import org.springframework.web.bind.annotation.DeleteMapping; 

import org.springframework.web.bind.annotation.GetMapping; 

import org.springframework.web.bind.annotation.PathVariable; 

import org.springframework.web.bind.annotation.PostMapping; 

import org.springframework.web.bind.annotation.PutMapping; 

import org.springframework.web.bind.annotation.RequestBody; 

import org.springframework.web.bind.annotation.RequestMapping; 

import org.springframework.web.bind.annotation.RestController;

import com.example.dto.LoginDto;
import com.example.dto.UpdatePasswordDto;
import com.example.dto.UpdateUserDetailsDto;
import com.example.dto.UserDto;
import com.example.entity.User;
import com.example.service.UserService; 

 

 

@RestController 

@RequestMapping("/ecom") 

public class Users { 

 

@Autowired 

private UserService userService; 

@GetMapping("/getUserById/{id}/") 

public User getUserById(@PathVariable int id) 

{ 

return userService.getUserById(id); 

 

} 

@PostMapping("/saveUser") 

public JSONObject  saveUser(@RequestBody UserDto userDto) 

{ 

User user=new User(userDto.getId(),userDto.getFirstName(),userDto.getLastName(),userDto.getEmail(),userDto.getPassword()); 

return userService.saveUser(user); 

 

} 

@GetMapping("/getUsers") 

public List<User> getUsers() 

{ 

return userService.getUser(); 

 

} 

 

@PostMapping("/verifyLogin") 

public JSONObject verifylogin(@RequestBody LoginDto users) 

{ 

 return userService.verifylogin(users); 

  

}  

@DeleteMapping(value="/deleteUser/{id}") 

public JSONObject delateUser(@PathVariable int id) 

{ 

return userService.delateUser(id); 

 

 

} 

@PutMapping(value="updateUser/{id}") 

public JSONObject updateUser(@RequestBody UpdateUserDetailsDto user ,@PathVariable int id) 

{ 

return userService.updateUser(user, id); 

 

} 

@PutMapping(value="updateUserPassword/{id}") 

public JSONObject updateUserPassword(@RequestBody UpdatePasswordDto updatePasswordDto ,@PathVariable int id) 

{ 

return userService.updateUserPassword(updatePasswordDto, id); 

 

} 

 

 

} 