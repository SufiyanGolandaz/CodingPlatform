package com.codingplatform;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codingplatform.model.Problem;

@SpringBootApplication
public class CodingplatformApplication {

	public static void main(String[] args) {
		
		

		SpringApplication.run(CodingplatformApplication.class, args);
	}

	
}
