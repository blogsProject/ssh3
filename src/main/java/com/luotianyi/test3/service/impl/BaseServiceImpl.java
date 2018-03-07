package com.luotianyi.test3.service.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.luotianyi.test3.dao.BaseDAO;

@Transactional
public class BaseServiceImpl<Entiy, ID extends Serializable> {
	
	BaseDAO<Entiy, ID> baseDAO;

	@Autowired
	public void setBaseDAO(BaseDAO<Entiy, ID> baseDAO) {
		this.baseDAO = baseDAO;
	}

	public Session getCur() {
		return baseDAO.getCur();
	}

	public ID save(Entiy entiy) {
		return baseDAO.save(entiy);
	}

	public boolean delete(ID id) {
		return baseDAO.delete(id);
	}

	public boolean update(Entiy entiy) {
		return baseDAO.update(entiy);
	}

	public List<Entiy> selectAll() {
		return baseDAO.selectAll();
	}

	public Entiy selectOne(ID id) {
		return baseDAO.selectOne(id);
	}
}
