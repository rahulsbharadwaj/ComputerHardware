package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.category;
import com.niit.ComputerHardware.model.product;

public interface productDao 
{
	public boolean saveorupdate(product product);
	public boolean delete(product product);
	public product getproduct(String prodId);
	public List<product> productlist();
}
