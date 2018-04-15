package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepositoty;

@Service
public class UserService {

	/*
	 * @Autowired
	 * newしなくてもインスタンス化して使用可能
	 */
	@Autowired
	private UserRepositoty userRepository;


	public List<User> findAll() {
		return userRepository.findAll();
	}

	public Optional<User> findOne(Long id) {
		return userRepository.findById(id);
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
	}
}
