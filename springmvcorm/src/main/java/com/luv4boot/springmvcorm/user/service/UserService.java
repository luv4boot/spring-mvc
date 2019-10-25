package com.luv4boot.springmvcorm.user.service;

import java.util.List;

import com.luv4boot.springmvcorm.user.entity.User;

public interface UserService {
	int save(User user);
	List<User> getAllUsers();
	User getOne(int id);
	User getEmail(String email);
}
