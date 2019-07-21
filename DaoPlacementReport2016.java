package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.Util.Util;

import Bean.PlacementReport2016;


public class DaoPlacementReport2016 {

	
	Connection con;
	String cmd="";
	java.sql.Date sdate1;
	java.sql.Date sdate2;
	 PreparedStatement ps;
	 ResultSet rs;
	 int n;
	 
	 
	 public ArrayList display() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<PlacementReport2016> al= new ArrayList<PlacementReport2016>();
	 		cmd="select * from placementreport2016";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			String roll_no = rs.getString(1);
	 			 String name=rs.getString(2);
	 	    	 String branch=rs.getString(3);
	 	    	 String comp_name=rs.getString(4);
	 	    	     	 
	             PlacementReport2016 sb= new PlacementReport2016(roll_no,name,branch,comp_name);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	 
	
	 public ArrayList display1() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<PlacementReport2016> al= new ArrayList<PlacementReport2016>();
	 		cmd="select * from placementreport2017";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			String roll_no = rs.getString(1);
	 			 String name=rs.getString(2);
	 	    	 String branch=rs.getString(3);
	 	    	 String comp_name=rs.getString(4);
	 	    	     	 
	             PlacementReport2016 sb= new PlacementReport2016(roll_no,name,branch,comp_name);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	 
	 
	 public ArrayList display2() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<PlacementReport2016> al= new ArrayList<PlacementReport2016>();
	 		cmd="select * from mcaplacementreport2016";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			String roll_no = rs.getString(1);
	 			 String name=rs.getString(2);
	 	    	 String branch=rs.getString(3);
	 	    	 String comp_name=rs.getString(4);
	 	    	     	 
	             PlacementReport2016 sb= new PlacementReport2016(roll_no,name,branch,comp_name);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	
	 
	 public ArrayList display3() throws Exception
	 {
	 	    con=Util.getConnection();
	 	    ArrayList<PlacementReport2016> al= new ArrayList<PlacementReport2016>();
	 		cmd="select * from mcaplacementreport2017";
	 		ps=con.prepareStatement(cmd);
	 		rs=ps.executeQuery();
	 		while(rs.next())
	 		{
	 			String roll_no = rs.getString(1);
	 			 String name=rs.getString(2);
	 	    	 String branch=rs.getString(3);
	 	    	 String comp_name=rs.getString(4);
	 	    	     	 
	             PlacementReport2016 sb= new PlacementReport2016(roll_no,name,branch,comp_name);
	             al.add(sb);
	 		}
	 	         return al;
	 	
	 }
	
	 
	 
}
