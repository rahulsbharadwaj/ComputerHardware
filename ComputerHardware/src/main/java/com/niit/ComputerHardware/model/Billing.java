package com.niit.ComputerHardware.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Billing
{
	@Id
private String BillingId;
private String BillingName;
private String BillingAddress;
private String BillingPhno;

public Billing()
{
	this.BillingId="Bil"+UUID.randomUUID().toString().substring(30).toUpperCase();
}


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="userId")
private user user;

public String getBillingId() {
	return BillingId;
}

public void setBillingId(String billingId) {
	BillingId = billingId;
}

public String getBillingName() {
	return BillingName;
}

public void setBillingName(String billingName) {
	BillingName = billingName;
}

public String getBillingAddress() {
	return BillingAddress;
}

public void setBillingAddress(String billingAddress) {
	BillingAddress = billingAddress;
}

public String getBillingPhno() {
	return BillingPhno;
}

public void setBillingPhno(String billingPhno) {
	BillingPhno = billingPhno;
}

public user getUser() {
	return user;
}

public void setUser(user user) {
	this.user = user;
}

}
