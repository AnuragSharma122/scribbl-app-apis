package com.anurag.scribbl.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anurag.scribbl.entities.User;
import com.anurag.scribbl.payloads.UserDTO;
import com.anurag.scribbl.repositories.UserRepo;
import com.anurag.scribbl.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserDTO createUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = this.userRepo.save(this.userDTOtoUser(userDTO));
		return this.userToUserDTO(user);
	}
	private User userDTOtoUser(UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setName(user.getName());
		user.setScore(user.getScore());
		return user;
	}
	private UserDTO userToUserDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setScore(user.getScore());
		return userDTO;
	}

}
