package com.Service;

import java.util.ArrayList;

import com.dao.Dao;

import Bean.StudentBean;

public class Service {

	
	public boolean insert(StudentBean s) throws Exception
	{
		Dao d=new Dao();
		boolean b=d.insert(s);
		return b;
	}
	
	
	
	public int delete(String adno)throws Exception
	{
		Dao d=new Dao();
	   int n= d.delete(adno);
		 if(n>0)
			 return 1;
		 else
			 return 0;
	}
	
	
	public StudentBean search(String adno) throws Exception
	{
		Dao d=new Dao();
		StudentBean obj1=d.search(adno);
		return obj1;
	}
	
	public ArrayList display() throws Exception
	{
		Dao d=new Dao();
		ArrayList<StudentBean> al=d.display();
		return al;
		
	}
	
	public int modify(String adno,StudentBean s) throws Exception
	{
		Dao d=new Dao();
		int n=d.modify(adno,s);
		return n;
	}
	
}
