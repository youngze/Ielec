package com.young.elec.dao;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {

	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	@Resource(name="sessionFactory")
	public final void setSessionFactoryDi(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
}
