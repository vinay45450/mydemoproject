package com.example.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.user.Model.User;
import com.example.user.Service.UserService;

@RestController
@RequestMapping("api/v1")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	
	
	@PostMapping(value="/adduser/todb" , consumes = { MediaType.APPLICATION_JSON_VALUE,MediaType.MULTIPART_FORM_DATA_VALUE })
	public User addUser(@RequestPart(name="user") String user ,@RequestPart(name="file") MultipartFile file)
	{
		
		
		 return userservice.addUser(user, file);
		
	
		

	}
	
	@PostMapping("/upload/local")
	public String  addUserToLocal(@RequestParam ("file") MultipartFile file)
	{
		
		
		
		return userservice.addUserToLocal(file);
		
	
		
	}

	@GetMapping("/allusers")
	public List<User> getAlluser()
	{
		 return userservice.getAllUsers();
		
		

	}
	
	@GetMapping("/getuserbyid/{userId}")
	public User getUserById(@PathVariable int userId) {
		return userservice.getUserById(userId);
	}


	
}
