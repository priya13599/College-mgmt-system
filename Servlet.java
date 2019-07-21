package com.abes;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Util.Util;

import Bean.StudentBean;

/**
 * Servlet implementation class Servlet
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
				PrintWriter pw = response.getWriter();
				response.setContentType("text/html");
				HttpSession sn=request.getSession();

				Connection con=Util.getConnection();
				PreparedStatement ps ;
				String target="";
				String cmd="";
				String val = request.getParameter("c1");
               
                
				String email = request.getParameter("email");
				String Password = request.getParameter("psw");
				
						
				if(val.equals("LOGIN"))
				{
					
			        cmd = "select * from Loginstudent where EMAIL =? and PASSWORD =?";
						 ps = con.prepareStatement(cmd);
						ps.setString(1, email);
						ps.setString(2, Password);
				      ResultSet rs1 = ps.executeQuery();
				    
						if(rs1.next())
						{
							
						    target ="StudentFunction.jsp";
                           
                            
						}
						 else
			        	 {
			        		 target ="invalid.jsp"; 
			        	 }
						sn.setAttribute("str", email);
						RequestDispatcher rd = request.getRequestDispatcher(target);
						rd.forward(request,response);
				}
			
				else if(val.equals("DISPLAY"))//DISPLAY
				{
					
					 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

					cmd="select * from studentdetails where email_id=?";
					ps=con.prepareStatement(cmd);
					HttpSession sn1 = request.getSession();
					String email2=(String) sn1.getAttribute("str");
					
					ps.setString(1,email2);
					ResultSet rs=ps.executeQuery();
					
					if(rs.next())
					{
			           

						String name=rs.getString(1);
				    	 String fname=rs.getString(2);
				    	 String email1=rs.getString(3);
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
			             StudentBean sb= new StudentBean(name,fname,email1,dob,gen,add,adnum,phno,doa,branch,cou,sem,year);
			          
			             rs.close();
			             ps.close();
			 			sn.setAttribute("s2", "2");
			 			sn.setAttribute("s3", sb);
			 			System.out.println(sb);
			             target="Display.jsp";
			             RequestDispatcher rd=request.getRequestDispatcher(target);
			    		 rd.forward(request, response);
					}
					
				}
				
	
}

	catch (Exception e1)
	{
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	//response.getWriter().append("Served at: ").append(request.getContextPath());
	
}
		
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
