package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.Billing;
import com.niit.ComputerHardware.model.category;

public interface BillingDao 
{
	public boolean saveorupdate(Billing billing);
	public boolean delete(Billing billing);
	public Billing getBilling(String BillingId);
	public List<Billing> Billinglist();
}
