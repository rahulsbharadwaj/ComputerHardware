package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.BillingDao;
import com.niit.ComputerHardware.model.Billing;
import com.niit.ComputerHardware.model.category;

@Repository("BillingDao")
@Transactional
public class BillingDaoImpl implements BillingDao 
{
	@Autowired
	SessionFactory sessionFactory;
	public BillingDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
		@Override
		public boolean saveorupdate(Billing billing) {
			sessionFactory.getCurrentSession().saveOrUpdate(billing);
			return true;
		}

		@Override
		public boolean delete(Billing billing) {
			sessionFactory.getCurrentSession().delete(billing);
			return true;
		}

		@Override
		public Billing getBilling(String BillingId) 
		{
			
			String query="from Billing where BillingId='"+BillingId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<Billing>list=(List<Billing>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list.get(0);
		}

		@Override
		public List<Billing> Billinglist() {
			
			List<Billing> billing=(List<Billing>)sessionFactory.getCurrentSession().createCriteria(Billing.class).
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return billing;
		}
		
}
