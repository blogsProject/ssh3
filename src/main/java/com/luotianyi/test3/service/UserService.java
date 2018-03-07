package com.luotianyi.test3.service;

import org.springframework.stereotype.Service;

import com.luotianyi.test3.entiy.User;

public interface UserService extends BaseService<User, Integer> {
	public User getUserByUsername(String username);
}
