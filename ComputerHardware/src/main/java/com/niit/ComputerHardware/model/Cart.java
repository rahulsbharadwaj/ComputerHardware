package com.niit.ComputerHardware.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart 
{
	@Id
	private String Cart_Id;
	private Double Grand_total=0.0;
	private int Total_items=0;
	
	public Cart()
	{
		this.Cart_Id="Car"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	
	
	
	@OneToMany(mappedBy="cart")
	private List<CartItems> cartitems;

	
	public String getCart_Id() {
		return Cart_Id;
	}
	public void setCart_Id(String cart_Id) {
		Cart_Id = cart_Id;
	}
	public Double getGrand_total() {
		return Grand_total;
	}
	public void setGrand_total(Double grand_total) {
		Grand_total = grand_total;
	}
	public int getTotal_items() {
		return Total_items;
	}
	public void setTotal_items(int total_items) {
		Total_items = total_items;
	}
	public List<CartItems> getCartitems() {
		return cartitems;
	}
	public void setCartitems(List<CartItems> cartitems) {
		this.cartitems = cartitems;
	}
	
	
}
