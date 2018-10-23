package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.Authentication;

public interface AuthenticationDao 
{
	public boolean saveorupdate(Authentication authentication);
	public boolean delete(Authentication authentication);
	public Authentication getAuthentication(String rId);
	public List<Authentication> Authenticationlist();

}
