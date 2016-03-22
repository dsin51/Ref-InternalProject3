package com.training.impl;

import java.io.Serializable;
import java.util.logging.Logger;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.training.entity.PersonalInfo;
import com.training.ifaces.DAO;

public class DAOImpl extends HibernateDaoSupport implements DAO<PersonalInfo> {

	
	@Override
	public Serializable add(PersonalInfo t) {
		Serializable key=getHibernateTemplate().save(t);
		return key;
	}

	@Override
	public PersonalInfo display(Serializable obj) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
