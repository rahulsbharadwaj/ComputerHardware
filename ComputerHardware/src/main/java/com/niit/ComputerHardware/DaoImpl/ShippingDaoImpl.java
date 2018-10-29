package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.ShippingDao;
import com.niit.ComputerHardware.model.Shipping;

@Repository("ShippingDao")
@Transactional
public class ShippingDaoImpl implements ShippingDao
{
	@Autowired
	SessionFactory sessionFactory;
	public ShippingDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
		@Override
		public boolean saveorupdate(Shipping shipping) {
			sessionFactory.getCurrentSession().saveOrUpdate(shipping);
			return true;
		}

		@Override
		public boolean delete(Shipping shipping) {
			sessionFactory.getCurrentSession().delete(shipping);
			return true;
		}

		@Override
		public Shipping getShipping(String shipId) {
			
			String query="from Shipping where ShipId='"+shipId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<Shipping>list=(List<Shipping>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list.get(0);
		}

		@Override
		public List<Shipping> Shippinglist() {
			
			List<Shipping> shipping=(List<Shipping>)sessionFactory.getCurrentSession().createCriteria(Shipping.class).
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return shipping;
		}
		@Override
		public List<Shipping> getaddbyuser(String userId) {
			String query="from Shipping where userId='"+userId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<Shipping>list=(List<Shipping>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list;
		}
}
