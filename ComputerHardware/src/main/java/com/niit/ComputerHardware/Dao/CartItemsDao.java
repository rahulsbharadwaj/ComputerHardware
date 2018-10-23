package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.CartItems;

public interface CartItemsDao
{
	public boolean saveorupdate(CartItems cartItems);
	public boolean delete(CartItems cartItems);
	public CartItems getCartItems(String Cart_Id);
	public List<CartItems> CartItemslist();

}
