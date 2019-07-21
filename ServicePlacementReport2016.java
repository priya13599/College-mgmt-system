package com.Service;

import java.util.ArrayList;


import com.dao.DaoPlacementReport2016;

import Bean.PlacementReport2016;



public class ServicePlacementReport2016 {

	
	public ArrayList display() throws Exception
	{
		DaoPlacementReport2016 d=new DaoPlacementReport2016();
		ArrayList<PlacementReport2016> al=d.display();
		return al;
		
	}
	
	
	public ArrayList display1() throws Exception
	{
		DaoPlacementReport2016 d=new DaoPlacementReport2016();
		ArrayList<PlacementReport2016> al=d.display1();
		return al;
		
	}
	
	
	public ArrayList display2() throws Exception
	{
		DaoPlacementReport2016 d=new DaoPlacementReport2016();
		ArrayList<PlacementReport2016> al=d.display2();
		return al;
		
	}
	
	
	public ArrayList display3() throws Exception
	{
		DaoPlacementReport2016 d=new DaoPlacementReport2016();
		ArrayList<PlacementReport2016> al=d.display3();
		return al;
		
	}
	
	
	
	
}
