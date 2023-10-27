package com.codingplatform.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingplatform.service.ProblemService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ProblemController {
	
	@Autowired
	private ProblemService problemService;
	
	@GetMapping("problems")
	public ResponseEntity<?> getAllProblems(){
		return new ResponseEntity<>(problemService.getAllProblems(), HttpStatus.OK);
		
	}
}