package com.luotianyi.test3.dao;

import com.luotianyi.test3.entiy.User;

public interface UserDAO extends BaseDAO<User, Integer> {
	public User getUserByUsername(String username);
}
