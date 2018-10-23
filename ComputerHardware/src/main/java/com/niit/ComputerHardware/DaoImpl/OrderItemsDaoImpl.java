package com.niit.ComputerHardware.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ComputerHardware.Dao.OrderItemsDao;
import com.niit.ComputerHardware.model.OrderItems;

@Repository("OrderItemsDao")
@Transactional
public class OrderItemsDaoImpl implements OrderItemsDao
{
	@Autowired
	SessionFactory sessionFactory;
	public OrderItemsDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
		@Override
		public boolean saveorupdate(OrderItems orderItems) {
			sessionFactory.getCurrentSession().saveOrUpdate(orderItems);
			return true;
		}

		@Override
		public boolean delete(OrderItems orderitems) {
			sessionFactory.getCurrentSession().delete(orderitems);
			return true;
		}

		@Override
		public OrderItems getOrderItems(String Orderitem_Id) {
			
			String query="from OrderItems where Orderitem_Id='"+Orderitem_Id+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(query);
			List<OrderItems>list=(List<OrderItems>)w.list();
			if(list == null||list.isEmpty())	
			return null;
			else
				return list.get(0);
		}

		@Override
		public List<OrderItems> OrderItemslist() {
			
			List<OrderItems> orderitems=(List<OrderItems>)sessionFactory.getCurrentSession().createCriteria(OrderItems.class).
					setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return orderitems;
		}
}
