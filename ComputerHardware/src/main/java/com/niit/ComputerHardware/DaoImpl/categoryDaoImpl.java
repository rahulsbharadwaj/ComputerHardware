package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.categoryDao;
import com.niit.ComputerHardware.model.category;

@Repository("categoryDao")
@Transactional
public class categoryDaoImpl implements categoryDao
{
@Autowired
SessionFactory sessionFactory;
public categoryDaoImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
}
	@Override
	public boolean saveorupdate(category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}

	@Override
	public boolean delete(category category) {
		sessionFactory.getCurrentSession().delete(category);
		return true;
	}

	@Override
	public category getcategory(String categoryid) {
		
		String query="from category where categoryid='"+categoryid+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(query);
		List<category>list=(List<category>)w.list();
		if(list == null||list.isEmpty())	
		return null;
		else
			return list.get(0);
	}

	@Override
	public List<category> catlist() {
		
		List<category> category=(List<category>)sessionFactory.getCurrentSession().createCriteria(category.class).
				setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return category;
	}

}