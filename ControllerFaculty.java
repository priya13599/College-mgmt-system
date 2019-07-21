package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.Service.ServiceFaculty;

import Bean.FacultyBean;
import Bean.StudentBean;


/**
 * Servlet implementation class ControllerFaculty
 */
public class ControllerFaculty extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerFaculty() {
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
		 ServiceFaculty ser=new ServiceFaculty();
		 String target="";
		 String str="";
		 int n;
		
		String button=request.getParameter("c1");
		try
		{
		if(button.equals("INSERT"))
		{  
			//System.out.println("insert abcd"+dob);
			String fac_name=request.getParameter("name");
			String email_id=request.getParameter("email");
			String dob=request.getParameter("bday");
			String gender=request.getParameter("m1");
			String address=request.getParameter("addr");
		    String desig=request.getParameter("desg");
		    String salary = request.getParameter("sal");
		    String phone=request.getParameter("phone");
		    String depart_id=request.getParameter("departmentid");
		    String department=request.getParameter("dep");
			String doj=request.getParameter("doj");
	 	
			
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		    FacultyBean s = new FacultyBean(fac_name,email_id,df.parse(dob),gender,address,desig,salary,phone,depart_id,department,df.parse(doj));
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
			target+="InsertFaculty.jsp";
			
		}
		
		
		
		else if(button.equals("DELETE"))
		{
			  String email=request.getParameter("email");
			   n=ser.delete(email);
			  if(n>0)
					 str+="Record deleted successfully";
				 else
					 str+="Record not found";
				 
					  sn.setAttribute("s1", str);
					 target+="DeleteFaculty.jsp";
			 
			 
		}
		
		
		
		else if(button.equals("SEARCH"))
		{

			String email_id=request.getParameter("email");
			 FacultyBean obj1=ser.search(email_id);
			  sn.setAttribute("s1", obj1);
				 target+="SearchFaculty.jsp";
		}
		
		
		else if(button.equals("DISPLAY"))
		{

			ArrayList<FacultyBean> al=ser.display();
			sn.setAttribute("s2", "1");
			sn.setAttribute("s1", al);
		target+="DisplayFaculty.jsp";
		}
		
		
		
		else if(button.equals("MODIFY"))
		{
			String fac_name=request.getParameter("name");
			String email_id=request.getParameter("email");
			String dob=request.getParameter("bday");
			String gender=request.getParameter("m1");
			String address=request.getParameter("addr");
		    String desig=request.getParameter("desg");
		    String salary = request.getParameter("sal");
		    String phone=request.getParameter("phone");
		    String dept_id = request.getParameter("departmentid");
		    String department = request.getParameter("dep");
			String doj=request.getParameter("doj");
	 	
			
			 SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
			    FacultyBean s = new FacultyBean(fac_name,email_id,df.parse(dob),gender,address,desig,salary,phone,dept_id,department,df.parse(doj));
	
			int n1 = ser.modify(email_id,s);
			if(n1 > 0)
			str+="Record Modified successfully";
			else
			 str+="Record not found";
				 
			 sn.setAttribute("s1", str);
			 target+="ModifyFaculty.jsp";
			 
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
