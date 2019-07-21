package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.Util.Util;

import Bean.StudentBean;

public class Dao {

	Connection con;
	String cmd="";
	java.sql.Date sdate1;
	java.sql.Date sdate2;
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
	 public boolean insert(StudentBean obj) throws Exception
		{ 
			
			con=Util.getConnection();
			cmd ="insert into studentdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		    ps=con.prepareStatement(cmd);
		     ps.setString(1,obj.getStudent_name());
		     ps.setString(2,obj.getFather_name());
		     ps.setString(3,obj.getEmail_id());
		     sdate1=new java.sql.Date(obj.getDOB().getTime());// java date converted into sql date
		      ps.setDate(4,sdate1);
		     ps.setString(5,obj.getGender());
		     ps.setString(6,obj.getAddress());
		     ps.setString(7,obj.getAdmission_no());
		     ps.setString(8,obj.getPhone_number());
		     sdate2=new java.sql.Date(obj.getDOA().getTime());// java date converted into sql date
		     ps.setDate(9,sdate2);
		     ps.setString(10,obj.getBranch());
		     ps.setString(11,obj.getCourse());
		     ps.setString(12,obj.getSemester());
		     ps.setString(13,obj.getYear());
		     n=ps.executeUpdate();
		    ps.close();
		    if(n>0)
		    return true;
		    else
		    	return false;
		   }
		
	 
	 public int delete(String adno)throws Exception
		{
			con= Util.getConnection();
			cmd="delete from studentdetails where Admission_no=?";
			ps=con.prepareStatement(cmd);
			ps.setString(1,adno);
			 n= ps.executeUpdate();
			 ps.close();
			 return n;
			
		}
	 
	 
	 public StudentBean search(String adno) throws Exception
		{
			 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			con=Util.getConnection();
			cmd="select * from studentdetails where Admission_no=?";
			ps=con.prepareStatement(cmd);
			ps.setString(1,adno);
			rs=ps.executeQuery();
			if(rs.next())
			{
				 String name=rs.getString(1);
		    	 String fname=rs.getString(2);
		    	 String email=rs.getString(3);
		    	 Date d1=rs.getDate(4);   //sql date
		    	 java.util.Date dob = new java.util.Date(d1.getTime()); //convering sql date into java date
		    	 String gen =rs.getString(5);
		    	 String add=rs.getString(6);
		    	 String adnum=rs.getString(7);
		    	 String phno=rs.getString(8);
		    	 Date d2=rs.getDate(9);   //sql date
		    	 java.util.Date doa = new java.util.Date(d2.getTime()); //convering sql date into java date
		    	 String branch =rs.getString(10);	
		    	 String cou =rs.getString(11);	    	 
	             String sem =rs.getString(12);	  
	             String year =rs.getString(13);	    	 
	             StudentBean sb= new StudentBean(name,fname,email,dob,gen,add,adnum,phno,doa,branch,cou,sem,year);
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
	 	    ArrayList<StudentBean> al= new ArrayList<StudentBean>();
	 		cmd="select * from studentdetails";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			 String name=rs.getString(1);
	 	    	 String fname=rs.getString(2);
	 	    	 String email=rs.getString(3);
	 	    	 Date d1=rs.getDate(4);   //sql date
	 	    	 java.util.Date dob = new java.util.Date(d1.getTime()); //convering sql date into java date
	 	    	 String gen =rs.getString(5);
	 	    	 String add=rs.getString(6);
	 	    	 String adnum=rs.getString(7);
	 	    	 String phno=rs.getString(8);
	 	    	 Date d2=rs.getDate(9);   //sql date
	 	    	 java.util.Date doa = new java.util.Date(d2.getTime()); //convering sql date into java date
	 	    	 String branch =rs.getString(10);	
	 	    	 String cou =rs.getString(11);	    	 
	             String sem =rs.getString(12);	  
	             String year =rs.getString(13);	    	 
	             StudentBean sb= new StudentBean(name,fname,email,dob,gen,add,adnum,phno,doa,branch,cou,sem,year);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	 
	 
	 public int modify(String adno,StudentBean e) throws Exception
	 {

	 	con=Util.getConnection();
	 	cmd="update studentdetails set Student_name=? , Father_name=? , email_id=? , DOB=? , Gender=? , Address=? , Phone_number=? ,DOA=?, Branch=? , Course=? , Semester=? , Year=? where Admission_no=?";
	 	 ps=con.prepareStatement(cmd);
	      ps.setString(1,e.getStudent_name());
	 	 ps.setString(2,e.getFather_name());
	 	 ps.setString(3,e.getEmail_id());
	 	 sdate1=new java.sql.Date(e.getDOB().getTime());// java date converted into sql date
	      ps.setDate(4,sdate1);
	 	 ps.setString(5,e.getGender());
	 	 ps.setString(6,e.getAddress());
	 	 ps.setString(7,e.getPhone_number());
	 	 sdate2=new java.sql.Date(e.getDOA().getTime());// java date converted into sql date
	      ps.setDate(8,sdate2);
	 	 ps.setString(9,e.getBranch());
	 	 ps.setString(10,e.getCourse());
	 	 ps.setString(11,e.getSemester());
	 	 ps.setString(12,e.getYear());
	 	 ps.setString(13,adno);
	      n=ps.executeUpdate();
	 	 ps.close();  
	      return n;
	      
	 	
	 }

		

	
}
