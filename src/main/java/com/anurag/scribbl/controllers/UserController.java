package com.anurag.scribbl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import com.anurag.scribbl.payloads.UserDTO;
import com.anurag.scribbl.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@MessageMapping("/createUser")
	@SendTo("/topic/greetings")
	public UserDTO createuser(UserDTO userDTO) {
		return this.userService.createUser(userDTO);
	}
}
