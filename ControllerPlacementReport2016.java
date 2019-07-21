package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Service.ServicePlacementReport2016;

import Bean.PlacementReport2016;


/**
 * Servlet implementation class ControllerPlacementReport2016
 */
public class ControllerPlacementReport2016 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerPlacementReport2016() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		HttpSession sn=request.getSession();
		 ServicePlacementReport2016 ser=new ServicePlacementReport2016();
		 String target="";
		 String str="";
		 int n;
		
		String button=request.getParameter("c1");
		String year = request.getParameter("year");
		if(button.equals("B.TECH"))
		{
		try
		{
			

			if(year.equals("2016"))
			{
				ArrayList<PlacementReport2016> al=ser.display();
				sn.setAttribute("s1", al);
				 target+="DisplayPlacementReport2016.jsp";
			}
			
			
			else if(year.equals("2017"))
			{
				ArrayList<PlacementReport2016> al=ser.display1();
				sn.setAttribute("s1", al);
				 target+="DisplayPlacementReport2016.jsp";
			}
			
			
			RequestDispatcher rd=request.getRequestDispatcher(target);
			 rd.forward(request, response);
			}
			catch(Exception e)
			{
				pw.print(e);
			}
		}
		
		
		
		
		else if (button.equals("MCA"))
		{
		try
		{
			

			if(year.equals("2016"))
			{
				ArrayList<PlacementReport2016> al=ser.display2();
				sn.setAttribute("s1", al);
				 target+="DisplayPlacementReport2016.jsp";
			}
			
			else if(year.equals("2017"))
			{
				ArrayList<PlacementReport2016> al=ser.display3();
				sn.setAttribute("s1", al);
				 target+="DisplayPlacementReport2016.jsp";
			}
			
			RequestDispatcher rd=request.getRequestDispatcher(target);
			 rd.forward(request, response);
			}
			catch(Exception e)
			{
				pw.print(e);
			}
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
