package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.Util.Util;

import Bean.FacultyBean;
import Bean.StudentBean;



public class DaoFaculty {

	
	Connection con;
	String cmd="";
	java.sql.Date sdate1;
	java.sql.Date sdate2;
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
	 public boolean insert(FacultyBean obj) throws Exception
		{ 
			
			con=Util.getConnection();
			cmd ="insert into facultydetails values(?,?,?,?,?,?,?,?,?,?,?)";
		    ps=con.prepareStatement(cmd);
		     ps.setString(1,obj.getFaculty_name());
		
		     ps.setString(2,obj.getEmail_id());
		     sdate1=new java.sql.Date(obj.getDOB().getTime());// java date converted into sql date
		      ps.setDate(3,sdate1);
		     ps.setString(4,obj.getGender());
		     ps.setString(5,obj.getAddress());
		     ps.setString(6,obj.getDesignation());
		     ps.setString(7,obj.getSalary());
		     ps.setString(8, obj.getPhone_number());
		     ps.setString(9,obj.getDepartment_id());
		     ps.setString(10,obj.getDepartment());
		     sdate2=new java.sql.Date(obj.getDOJ().getTime());// java date converted into sql date
		     ps.setDate(11,sdate2);
		    
		     n=ps.executeUpdate();
		    ps.close();
		    if(n>0)
		    return true;
		    else
		    	return false;
		   }
	 
	 
	 
	 public int delete(String email_id)throws Exception
		{
			con= Util.getConnection();
			cmd="delete from facultydetails where email_id=?";
			ps=con.prepareStatement(cmd);
			ps.setString(1,email_id);
			 n= ps.executeUpdate();
			 ps.close();
			 return n;
			
		}
		
	 
	 

	 public FacultyBean search(String email_id) throws Exception
		{
			 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			con=Util.getConnection();
			cmd="select * from facultydetails where email_id=?";
			ps=con.prepareStatement(cmd);
			ps.setString(1,email_id);
			rs=ps.executeQuery();
			if(rs.next())
			{
				 String name=rs.getString(1);
		    	 String email=rs.getString(2);
		    	 Date d1=rs.getDate(3);   //sql date
		    	 java.util.Date dob = new java.util.Date(d1.getTime()); //convering sql date into java date
		    	 String gen =rs.getString(4);
		    	 String add=rs.getString(5);
		    	 String desig=rs.getString(6);
		    	 String sal=rs.getString(7);
		    	 String phno=rs.getString(8);
		    	 String dept_id = rs.getString(9);
		    	 String dept = rs.getString(10);
		    	 Date d2=rs.getDate(11);   //sql date
		    	 java.util.Date doj = new java.util.Date(d2.getTime()); //convering sql date into java date
		        	 
	            FacultyBean sb= new FacultyBean(name,email,dob,gen,add,desig,sal,phno,dept_id,dept,doj);
	             rs.close();
	             ps.close();
	             return sb;
		   }
			else
			{
				return null;
			}
		}
	 
	 
	 
	 public ArrayList display() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<FacultyBean> al= new ArrayList<FacultyBean>();
	 		cmd="select * from facultydetails";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			 String name=rs.getString(1);
	 	    	 String email=rs.getString(2);
	 	    	 Date d1=rs.getDate(3);   //sql date
	 	    	 java.util.Date dob = new java.util.Date(d1.getTime()); //convering sql date into java date
	 	    	 String gen =rs.getString(4);
	 	    	 String add=rs.getString(5);
	 	    	String desig = rs.getString(6);
	 	    	String sal = rs.getString(7);
	 	    	 String phno=rs.getString(8);
	 	    	 String dept_id = rs.getString(9);
	 	    	 String dept = rs.getString(10);
	 	    	 Date d2=rs.getDate(11);   //sql date
	 	    	 java.util.Date doj = new java.util.Date(d2.getTime()); //convering sql date into java date
	 	    	    	 
	             FacultyBean sb= new FacultyBean(name,email,dob,gen,add,desig,sal,phno,dept_id,dept,doj);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	 
	 
	 
	 public int modify(String email_id,FacultyBean e) throws Exception
	 {

	 	con=Util.getConnection();
	 	cmd="update facultydetails set faculty_name=?, dob=? , Gender=? , Address=?, Designation=?, Salary=?, Phone_no=? ,Department_id=?, Department=?, doj=? where email_id=?";
	 	 ps=con.prepareStatement(cmd);
	      ps.setString(1,e.getFaculty_name());
	 	 sdate1=new java.sql.Date(e.getDOB().getTime());// java date converted into sql date
	      ps.setDate(2,sdate1);
	 	 ps.setString(3,e.getGender());
	 	 ps.setString(4,e.getAddress());
	 	 ps.setString(5,e.getDesignation());
	 	 ps.setString(6, e.getSalary());
	 	 ps.setString(7,e.getPhone_number());
	 	 ps.setString(8, e.getDepartment_id());
	 	 ps.setString(9, e.getDepartment());
	 	 sdate2=new java.sql.Date(e.getDOJ().getTime());// java date converted into sql date
	      ps.setDate(10,sdate2);
	 	 ps.setString(11,email_id);
	 	
	      n=ps.executeUpdate();
	 	 ps.close();  
	      return n;
	      
	 	
	 }
	 
}
