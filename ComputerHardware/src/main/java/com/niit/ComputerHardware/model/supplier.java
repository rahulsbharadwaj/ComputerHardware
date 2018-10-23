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
public class supplier
{
	@Id
	private String supId;
	private String supName;
	private String supAddress;
	private String supPhNo;
	private String supEmailId;
	private String supPwd;
	
	public supplier()
	{
		this.supId="sup"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	
	
	
	
	@OneToMany(mappedBy="supplier")
	private List<product> product;
	
	public List<product> getProduct() {
		return product;
	}
	public void setProduct(List<product> product) {
		this.product = product;
	}
	public String getSupId() {
		return supId;
	}
	public void setSupId(String supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupAddress() {
		return supAddress;
	}
	public void setSupAddress(String supAddress) {
		this.supAddress = supAddress;
	}
	public String getSupPhNo() {
		return supPhNo;
	}
	public void setSupPhNo(String supPhNo) {
		this.supPhNo = supPhNo;
	}
	public String getSupEmailId() {
		return supEmailId;
	}
	public void setSupEmailId(String supEmailId) {
		this.supEmailId = supEmailId;
	}
	public String getSupPwd() {
		return supPwd;
	}
	public void setSupPwd(String supPwd) {
		this.supPwd = supPwd;
	}

	
	
}
