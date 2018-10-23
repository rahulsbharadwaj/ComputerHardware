package com.niit.ComputerHardware.Dao;

import java.util.List;

import com.niit.ComputerHardware.model.category;

public interface categoryDao 
{
public boolean saveorupdate(category category);
public boolean delete(category category);
public category getcategory(String categoryid);
public List<category> catlist();

}
