package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.OrderItems;

public interface OrderItemsDao 
{
	public boolean saveorupdate(OrderItems orderitems);
	public boolean delete(OrderItems orderitems);
	public OrderItems getOrderItems(String Orderitem_Id);
	public List<OrderItems> OrderItemslist();

}
