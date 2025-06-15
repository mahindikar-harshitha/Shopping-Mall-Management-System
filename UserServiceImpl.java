package com.example.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> fetchUserList() {
		return userRepository.findAll();
	}

	@Override
	public User fetchUserById(Long userId) {
		
		return userRepository.findById(userId).get();
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepository.deleteById(userId);
		
	}

	@Override
	public User updateUser(Long userId, User user) {
		User userDB = userRepository.findById(userId).get();

	       if(Objects.nonNull(user.getName()) &&
	       !"".equalsIgnoreCase(user.getName())) {
	           userDB.setName(user.getName());
	       }

	       if(Objects.nonNull(user.getType()) &&
	               !"".equalsIgnoreCase(user.getType())) {
	           userDB.setType(user.getType());
	       }

	       if(Objects.nonNull(user.getPassword()) &&
	               !"".equalsIgnoreCase(user.getPassword())) {
	           userDB.setPassword(user.getPassword());
	       }

	       return userRepository.save(userDB);
	}

}
