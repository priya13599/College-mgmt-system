package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Service.Service;

import Bean.StudentBean;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
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
		 Service ser=new Service();
		 String target="";
		 String str="";
		 int n;
		
		String button=request.getParameter("c1");
		try
		{
		if(button.equals("INSERT"))
		{  
			//System.out.println("insert abcd"+dob);
			String std_name=request.getParameter("name");
		    String f_name=request.getParameter("fname");
			String email_id=request.getParameter("email");
			String dob=request.getParameter("bday");
			String gender=request.getParameter("gender");
			String address=request.getParameter("addr");
		    String adno=request.getParameter("admissionno");
		    String phone=request.getParameter("phone");
			String doa=request.getParameter("dateofadmission");
	 		String branch=request.getParameter("branch");
			String courses=request.getParameter("course");
			String sem=request.getParameter("sem");
			String year=request.getParameter("year");
			
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		    StudentBean s = new StudentBean(std_name,f_name,email_id,df.parse(dob),gender,address,adno,phone,df.parse(doa),branch,courses,sem,year);
		   boolean flag=false;
			  // System.out.println("dao inserr");
				flag = ser.insert(s);
			//System.out.println("inser boo"+flag);
			if(flag) {
				 str+=" Record added successfully";
				
				 }
		      else
		    	 str+=" Record not added"; 
				 sn.setAttribute("s1", str);
			target+="Insert.jsp";
			
		}
		
		
		
		else if(button.equals("DELETE"))
		{
			  String adno=request.getParameter("admissionno");
			   n=ser.delete(adno);
			  if(n>0)
					 str+="Record deleted successfully";
				 else
					 str+="Record not found";
				 
					  sn.setAttribute("s1", str);
					 target+="Delete.jsp";
			 
			 
		}
		
		else if(button.equals("SEARCH"))
		{

			String adno=request.getParameter("admissionno");
			  StudentBean obj1=ser.search(adno);
			  sn.setAttribute("s1", obj1);
				 target+="Search.jsp";
		}
		
		
		else if(button.equals("DISPLAY"))
		{
			ArrayList<StudentBean> al=ser.display();
			sn.setAttribute("s2", "1");
			sn.setAttribute("s1", al);
			

			 target+="Display.jsp";
		}
		
		
		else if(button.equals("MODIFY"))
		{
			String std_name=request.getParameter("name");
		    String f_name=request.getParameter("fname");
			String email_id=request.getParameter("email");
			String dob=request.getParameter("bday");
			String gender=request.getParameter("gender");
			String address=request.getParameter("addr");
		    String adno=request.getParameter("admissionno");
		    String phone=request.getParameter("phone");
			String doa=request.getParameter("dateofadmission");
	 		String branch=request.getParameter("branch");
			String courses=request.getParameter("course");
			String sem=request.getParameter("sem");
			String year=request.getParameter("year");
			
			 SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
			    StudentBean s = new StudentBean(std_name,f_name,email_id,df.parse(dob),gender,address,adno,phone,df.parse(doa),branch,courses,sem,year);
	
			int n1 = ser.modify(adno,s);
			if(n1 > 0)
			str+="Record Modified successfully";
			else
			 str+="Record not found";
				 
			 sn.setAttribute("s1", str);
			 target+="Modify.jsp";
			 
		}
		
		RequestDispatcher rd=request.getRequestDispatcher(target);
		 rd.forward(request, response);
		}
		catch(Exception e)
		{
			pw.print(e);
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
