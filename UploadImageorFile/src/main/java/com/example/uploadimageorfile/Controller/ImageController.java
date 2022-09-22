package com.example.uploadimageorfile.Controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController {
	
	@PostMapping("/uploadimage")
	public String UploadImage(@RequestParam(name="file") MultipartFile file) throws Exception
	{
		
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		//String Path_Directory="C:\\Users\\Dell\\eclipse-workspace\\UploadImageorFile\\src\\main\\resources\\static\\image";
		
		String Path_Directory=new ClassPathResource("static/image").getFile().getAbsolutePath();
		Files.copy(file.getInputStream(),Paths.get(Path_Directory+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
		
		return "Successfully image is uploaded";
		
	}

}
