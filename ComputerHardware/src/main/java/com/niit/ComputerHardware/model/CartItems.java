package com.niit.ComputerHardware.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class CartItems 
{
	@Id
	private String Cartitem_Id;
	private double Price;
	
	public CartItems()
	{
		this.Cartitem_Id="Cai"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	@ManyToOne
	@JoinColumn(name="Cart_Id")
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name="prodId")
	private product product;

	
	public String getCartitem_Id() {
		return Cartitem_Id;
	}
	public void setCartitem_Id(String cartitem_Id) {
		Cartitem_Id = cartitem_Id;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public product getProduct() {
		return product;
	}
	public void setProduct(product product) {
		this.product = product;
	}
	
	
}
