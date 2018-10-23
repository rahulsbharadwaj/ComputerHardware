package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.Cart;

public interface CartDao 
{
	public boolean saveorupdate(Cart cart);
	public boolean delete(Cart cart);
	public Cart getCart(String Cart_Id);
	public List<Cart> Cartlist();
}
