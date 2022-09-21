package com.example.user.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.user.Model.User;
import com.example.user.Repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userrepository;

	private static  String Path_Directory="C:\\Users\\Dell\\Desktop\\vinay\\";
	
	
	@Override
	public User addUser(String user, MultipartFile file) {
		
		
		User userJson=new User();
		try {
			ObjectMapper objectmapper=new ObjectMapper();
			userJson=objectmapper.readValue(user, User.class);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	

		String Path_Directory = "C:\\Users\\Dell\\Desktop\\vinay\\";
		try {
			Path_Directory = new ClassPathResource("C:\\Users\\Dell\\Desktop\\vinay\\").getFile().getAbsolutePath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Files.copy(file.getInputStream(),Paths.get(Path_Directory+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        Path path=Paths.get(Path_Directory + file.getOriginalFilename());
        String originalPath = path.toString();
		
		 userJson.setUserPhotoUrl(originalPath);
		return userrepository.save(userJson);
		
		
		
	}

	@Override
	public String addUserToLocal(MultipartFile file) {
	

		try { 
		       byte[] data = file.getBytes();
		       Path path=Paths.get(Path_Directory + file.getOriginalFilename());
            Files.write(path, data);
            
            return "file uploaded succesfully";
	} catch (IOException e) {
		
		e.printStackTrace();
	}
		return null;
		
	}

	@Override
	public List<User> getAllUsers() {
		
		 return userrepository.findAll();
	}

	@Override
	public User getUserById(int userId) {
		
		return userrepository.findById(userId).get();
	}

	

}
