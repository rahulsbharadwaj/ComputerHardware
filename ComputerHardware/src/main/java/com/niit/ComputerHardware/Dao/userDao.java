package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.product;
import com.niit.ComputerHardware.model.supplier;
import com.niit.ComputerHardware.model.user;

public interface userDao
{
	public boolean saveorupdate(user user);
	public boolean delete(user user);
	public user getuser(String userId);
	public List<user> userlist();
	public user isValid(String umail,String pwd);
	public user getEmail(String currusername);
}
