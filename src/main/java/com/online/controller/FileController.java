package com.online.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.online.Entity.FileEntity;
import com.online.repository.FileRepository;

public class FileController {

	@Autowired FileRepository fileRepo;
	@PostMapping("/uploadfiles")
	public ResponseEntity<String> uploadFile(@RequestParam MultipartFile file) throws IOException {
		FileEntity fes=new FileEntity();
		fes.setFileName(file.getOriginalFilename());
		fes.setFileType(file.getContentType());
		fes.setData(file.getBytes());
		fileRepo.save(fes);
		return ResponseEntity.ok("Files insert Successfully::"+file.getOriginalFilename());
	}
	
	@PostMapping("/uploadmultifiles")
	public ResponseEntity<List<Object>> uploadFileMulti(@RequestParam MultipartFile[] file) throws IOException {
		List<Object> response=Arrays.stream(file).map(s->{
			try {
				return uploadFile(s);
			}catch (Exception e) {
				e.printStackTrace();
				return "files upload failed" +e.getLocalizedMessage();
			}
		}).collect(Collectors.toList());
		return ResponseEntity.ok(response);
	}
}

