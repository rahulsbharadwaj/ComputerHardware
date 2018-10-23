package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.supplier;

public interface supplierDao 
{
	public boolean saveorupdate(supplier supplier);
	public boolean delete(supplier supplier);
	public supplier getsupplier(String supId);
	public List<supplier> supplierlist();
}
