package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.userDao;
import com.niit.ComputerHardware.model.Authentication;
import com.niit.ComputerHardware.model.Billing;
import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.user;
@Repository("userDao")
@Transactional
public class userDaoImpl implements userDao
{
	@Autowired
	SessionFactory sessionFactory;
	public userDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
		@Override
		public boolean saveorupdate(user user) {
			Authentication auth=new Authentication();
			auth.setUsername(user.getUserEmailId());
			Billing bill= new Billing();
			bill.setBillingAddress(user.getUserAddress());
			bill.setBillingPhno(user.getUserPhNo());
			bill.setBillingName(user.getUserName());
			user.setBilling(bill);
			bill.setUser(user);
			sessionFactory.getCurrentSession().saveOrUpdate(bill);
			
			sessionFactory.getCurrentSession().saveOrUpdate(auth);
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		}

		@Override
		public boolean delete(user user) {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		}

		@Override
		public user getuser(String userId) {
			String query="from user where userId='"+userId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<user>list=(List<user>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list.get(0);
		}

		@Override
		public List<user> userlist() {
			List<user>user=(List<user>)sessionFactory.getCurrentSession().createCriteria(user.class).
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return user;
		}
		@Override
		public user isValid(String umail, String pwd) {
			
				String u1="from User where email='"+umail+"'and password='"+pwd+"'";
				Query q1=sessionFactory.getCurrentSession().createQuery(u1);
				List<user> list=(List<user>) q1.list();
				if(list==null || list.isEmpty())
				{		
				return null;
			}
				else
				{
					return list.get(0);
				}
			}
		@Override
		public user getEmail(String currusername) {
			String query="from user where email='"+currusername+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<user>list=(List<user>)w.list();
			if(list == null||list.isEmpty())	
			{
				return null;
			}
			
				else
				{
					return list.get(0);
				}
		}

}
