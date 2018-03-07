package com.luotianyi.test3.service;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public interface BaseService<Entiy, ID extends Serializable> {
	public Session getCur();

	public ID save(Entiy entiy);

	public boolean delete(ID id);

	public boolean update(Entiy entiy);

	public List<Entiy> selectAll();

	public Entiy selectOne(ID id);
}
