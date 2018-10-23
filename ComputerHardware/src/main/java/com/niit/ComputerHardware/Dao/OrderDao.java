package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.Order;

public interface OrderDao 
{
	public boolean saveorupdate(Order order);
	public boolean delete(Order  order);
	public Order getOrder(String Order_Id);
	public List<Order> Orderlist();

}
