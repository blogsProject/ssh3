package com.luotianyi.test3.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.luotianyi.test3.dao.UserDAO;
import com.luotianyi.test3.entiy.User;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User, Integer> implements UserDAO {
	public User getUserByUsername(String username) {
		String hql = "from User user where username=:username";
		Query query = getCur().createQuery(hql);
		query.setParameter("username", username);
		return (User) query.uniqueResult();
	}
}
