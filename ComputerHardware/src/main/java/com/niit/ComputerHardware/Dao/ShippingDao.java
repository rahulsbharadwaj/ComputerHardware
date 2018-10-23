package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.Shipping;

public interface ShippingDao 
{
	public boolean saveorupdate(Shipping shipping);
	public boolean delete(Shipping shipping);
	public Shipping getShipping(String shipId);
	public List<Shipping> Shippinglist();
}
