package com.luv4boot.springmvcorm.user.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv4boot.springmvcorm.user.dao.UserDAO;
import com.luv4boot.springmvcorm.user.entity.User;
import com.luv4boot.springmvcorm.user.service.UserService;

@Service
public class UserSeriviceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = dao.findAll();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getOne(int id) {
		return dao.findOne(id);
	}

	@Override
	public User getEmail(String email) {
		return dao.findEmail(email);
	}
}
