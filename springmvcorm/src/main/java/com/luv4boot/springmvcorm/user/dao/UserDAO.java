package com.luv4boot.springmvcorm.user.dao;

import java.util.List;

import com.luv4boot.springmvcorm.user.entity.User;

public interface UserDAO {
	int create(User user);

	List<User> findAll();
	
	User findOne(int id);
	User findEmail(String email);
}
