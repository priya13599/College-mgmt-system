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

import Bean.FacultyBean;

/**
 * Servlet implementation class Servletfaculty
 */
public class Servletfaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servletfaculty() {
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
					//System.out.println("val=="+val);
							
					if(val.equals("LOGIN"))
					{
						//System.out.println("enter");
						String email = request.getParameter("email");
						//System.out.println("form ki valuee=="+ email);
						
						String Password = request.getParameter("psw");
						//System.out.println("form ki value=="+ Password);
				        cmd = "select* from Loginfaculty where EMAIL =? and PASSWORD =?";
							 ps = con.prepareStatement(cmd);
							ps.setString(1, email);
							ps.setString(2, Password);
					      ResultSet rs1 = ps.executeQuery();
					     // System.out.println("rs agya");
							if(rs1.next())
							{
								
							    target ="FacultyFunction.jsp";
                               
                                
							}
							 else
				        	 {
				        		 target ="invalid.jsp";  //not working
				        	 }
							sn.setAttribute("str", email);

							RequestDispatcher rd = request.getRequestDispatcher(target);
							rd.forward(request,response);
					}
					
					
					if(val.equals("DISPLAY"))
					{
						
								//System.out.println("hjcdgjzgczjh");
								 SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");

								cmd="select * from facultydetails where email_id=?";
								ps=con.prepareStatement(cmd);
								HttpSession sn1 = request.getSession();
								String email2=(String) sn1.getAttribute("str");
								//System.out.println("aaa"+email2);
								ps.setString(1,email2);
								ResultSet rs=ps.executeQuery();
								 //System.out.println("off");

								if(rs.next())
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
						             rs.close();
						             ps.close();
						 			sn.setAttribute("s2", "2");
						 			sn.setAttribute("s3", sb);
						 			System.out.println(sb);
						             target="DisplayFaculty.jsp";
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
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
