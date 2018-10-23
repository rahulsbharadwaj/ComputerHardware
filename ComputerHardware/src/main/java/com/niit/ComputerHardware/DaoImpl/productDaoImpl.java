package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.productDao;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.product;
@Repository("productDao")
@Transactional
public class productDaoImpl implements productDao
{
	@Autowired
	SessionFactory sessionFactory;
	public productDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
		@Override
		public boolean saveorupdate(product product) {
			sessionFactory.getCurrentSession().saveOrUpdate(product);
			return true;
		}

		@Override
		public boolean delete(product product) {
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}

		@Override
		public product getproduct(String prodId) {
			String query="from product where prodId='"+prodId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<product>list=(List<product>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list.get(0);
		}

		@Override
		public List<product> productlist() {
			List<product> product=(List<product>)sessionFactory.getCurrentSession().createCriteria(product.class).
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return product;
		}
		
		}
