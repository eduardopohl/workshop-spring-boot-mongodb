package com.eduardopohl.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduardopohl.workshopmongo.domain.User;
import com.eduardopohl.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
}
