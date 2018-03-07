package com.luotianyi.test3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luotianyi.test3.dao.UserDAO;
import com.luotianyi.test3.entiy.User;
import com.luotianyi.test3.service.UserService;

@Transactional
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

	UserDAO userDAO;

	@Autowired
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User getUserByUsername(String username) {
		return userDAO.getUserByUsername(username);
	}

}
