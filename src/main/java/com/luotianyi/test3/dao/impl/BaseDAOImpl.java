package com.luotianyi.test3.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BaseDAOImpl<Entiy, ID extends Serializable> {
	@Autowired
	SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	Class<Entiy> entiy = (Class<Entiy>) ((ParameterizedType) getClass().getGenericSuperclass())
			.getActualTypeArguments()[0];

	public Session getCur() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public ID save(Entiy entiy) {
		return (ID) getCur().save(entiy);
	}

	public boolean delete(ID id) {
		getCur().delete(id);
		return true;
	}

	public boolean update(Entiy entiy) {
		getCur().update(entiy);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Entiy> selectAll() {
		String hql = "from " + entiy.getName() + " entiy";
		Query query = getCur().createQuery(hql);
		return query.list();
	}

	public Entiy selectOne(ID id) {
		return getCur().get(entiy, id);
	}
}
