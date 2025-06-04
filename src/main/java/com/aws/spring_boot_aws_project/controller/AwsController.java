package com.aws.spring_boot_aws_project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/aws")
public class AwsController {
	
	
	@GetMapping("/user")
	public ResponseEntity<String> getMethodName(@RequestParam("name") String name) {
		return new ResponseEntity<String>(new String("welcome to AWS first deployment "+ name), HttpStatus.OK);
	}
	

}
