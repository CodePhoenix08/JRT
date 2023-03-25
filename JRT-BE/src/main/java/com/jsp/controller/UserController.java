package com.jsp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	Logger log=LogManager.getLogger(UserController.class);
	@GetMapping("/login")
	String login(String emailId,String Password) {
		log.info("Calling Login API");
		return null;
	}
}
