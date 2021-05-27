package com.app.insurance.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.app.insurance.model.User;
import com.app.insurance.repository.UserRepository;

import javassist.NotFoundException;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository; 
	
	
	
	@Override
	public List<User> getAllUsers() {
		List<User> allUsers = userRepository.findAll();
		return allUsers;
	}

	@Override
	public User addUser(User user) throws Exception {
//		Optional<User> initialUser = userRepository.findByEmail(user.getEmail());
//		System.out.println(user.getEmail());
//		if(initialUser==null) {
//			return Optional.of(userRepository.save(user));
//		}
//		else 
//			throw new NotFoundException("Email already present");
		Optional<User> initialUser = userRepository.findByEmail(user.getEmail());
		System.out.println(initialUser);
		return userRepository.save(user);
		
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public Optional<User> viewUser(int userId) {
		return userRepository.findById(userId);
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public User fetch(String email, String password) {
		return userRepository.findByEmailAndPassword(email,password);
	}

	@Override
	public Optional<User> viewUserbyEmail(String email) {
		return userRepository.findByEmail(email);
	}

	


}
