package com.Service;




import java.util.ArrayList;

import com.dao.Dao;
import com.dao.DaoFaculty;

import Bean.FacultyBean;
import Bean.StudentBean;


public class ServiceFaculty {

	
	public boolean insert(FacultyBean s) throws Exception
	{
		DaoFaculty d=new DaoFaculty();
		boolean b=d.insert(s);
		return b;
	}
	
	public int delete(String email_id)throws Exception
	{
		DaoFaculty d=new DaoFaculty();
	   int n= d.delete(email_id);
		 if(n>0)
			 return 1;
		 else
			 return 0;
	}
	
	

	public FacultyBean search(String email_id) throws Exception
	{
		DaoFaculty d=new DaoFaculty();
		FacultyBean obj1=d.search(email_id);
		return obj1;
	}
	
	
	public ArrayList display() throws Exception
	{
		DaoFaculty d=new DaoFaculty();
		ArrayList<FacultyBean> al=d.display();
		return al;
		
	}
	
	
	public int modify(String email_id,FacultyBean s) throws Exception
	{
		DaoFaculty d=new DaoFaculty();
		int n=d.modify(email_id,s);
		return n;
	}
	
	
	
}
