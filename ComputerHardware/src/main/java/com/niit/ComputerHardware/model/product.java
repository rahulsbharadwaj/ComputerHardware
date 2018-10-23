package com.niit.ComputerHardware.model;




import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class product 
{
	@Transient
	private MultipartFile pimg;
	
	public MultipartFile getPimg() {
		return pimg;
	}
	public void setPimg(MultipartFile pimg) {
		this.pimg = pimg;
	}
	@Id
private String prodId;
private String prodName;
private String prodPrice;
private String prodQty;
private String ProdDiscription;



public product()
{
	this.prodId="Pro"+UUID.randomUUID().toString().substring(30).toUpperCase();
}

@ManyToOne
@JoinColumn(name="categoryid")
private category category;

@ManyToOne
@JoinColumn(name="supId")
private supplier supplier;

public supplier getSupplier() {
	return supplier;
}
public void setSupplier(supplier supplier) {
	this.supplier = supplier;
}
public category getCategory() {
	return category;
}
public void setCategory(category category) {
	this.category = category;
}
public String getProdId() {
	return prodId;
}
public void setProdId(String prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public String getProdPrice() {
	return prodPrice;
}
public void setProdPrice(String prodPrice) {
	this.prodPrice = prodPrice;
}
public String getProdQty() {
	return prodQty;
}
public void setProdQty(String prodQty) {
	this.prodQty = prodQty;
}
public String getProdDiscription() {
	return ProdDiscription;
}
public void setProdDiscription(String prodDiscription) {
	ProdDiscription = prodDiscription;
}



}
