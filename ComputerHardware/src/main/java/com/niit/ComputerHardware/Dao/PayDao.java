package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.Pay;

public interface PayDao 
{
	public boolean saveorupdate(Pay pay);
	public boolean delete(Pay pay);
	public Pay getPay(String Pay_Id);
	public List<Pay> Paylist();
}
