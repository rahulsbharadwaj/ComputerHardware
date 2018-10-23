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
public class category 
{
	@Id
private String categoryid;
private String categoryname;

public category()
{
	this.categoryid="CAT"+UUID.randomUUID().toString().substring(30).toUpperCase();
}

@OneToMany(mappedBy="category")
private List<product> product;

public String getCategoryid() {
	return categoryid;
}

public void setCategoryid(String categoryid) {
	this.categoryid = categoryid;
}

public String getCategoryname() {
	return categoryname;
}

public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}

public List<product> getProduct() {
	return product;
}

public void setProduct(List<product> product) {
	this.product = product;
}





}
