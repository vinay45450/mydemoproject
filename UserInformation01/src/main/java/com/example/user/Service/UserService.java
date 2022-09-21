package com.example.user.Service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.user.Model.User;

public interface UserService {
	
	public User addUser(String user,MultipartFile file);

	public String addUserToLocal(MultipartFile file);
	
	public List<User> getAllUsers();
	
	public User getUserById(int userId);

	

}
