package com.niit.ComputerHardware.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class user
{
	@Id
private String userId;
private String userName;
private String userEmailId;
private String userPwd;
private String userPhNo;
private String userAddress;


public user()
{
	this.userId="Use"+UUID.randomUUID().toString().substring(30).toUpperCase();
}


@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="Cart_Id")
private Cart cart;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="BillingId")
private Billing billing;


public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public Billing getBilling() {
	return billing;
}
public void setBilling(Billing billing) {
	this.billing = billing;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserEmailId() {
	return userEmailId;
}
public void setUserEmailId(String userEmailId) {
	this.userEmailId = userEmailId;
}
public String getUserPwd() {
	return userPwd;
}
public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}
public String getUserPhNo() {
	return userPhNo;
}
public void setUserPhNo(String userPhNo) {
	this.userPhNo = userPhNo;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}



}
