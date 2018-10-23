package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.supplierDao;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.supplier;
@Repository("supplierDao")
@Transactional

public class supplierDaoImpl implements supplierDao
{
	@Autowired
	SessionFactory sessionFactory;
	public supplierDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
		@Override
		public boolean saveorupdate(supplier supplier) {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}

		@Override
		public boolean delete(supplier supplier) {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}

		@Override
		public supplier getsupplier(String supId) {
			String query="from supplier where supId='"+supId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<supplier>list=(List<supplier>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list.get(0);
		}

		@Override
		public List<supplier> supplierlist() {
			List<supplier> supplier=(List<supplier>)sessionFactory.getCurrentSession().createCriteria(supplier.class).
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return supplier;
		}
}
