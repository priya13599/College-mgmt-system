<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Bean.FacultyBean,java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<title>Display Status</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <style type="text/css">
.button
{
border:none;
color:white;
padding:15px 32px;
text-align:center;
text-decoration:none;
display:inline-block;
font-size:16px;
margin:4px 2px;
cursor:pointer;

}

</style>
   <link rel="stylesheet" href="home.css">
</head>
<body style="background-color:white">
<div class="logo">
<img src="ABESEC_logo.png" alt="ABES EC" float="left" height="130" width="110">
<div class ="title">
<u><font style="margin-left:-150px ; margin-top:60px; position:absolute; color:orange; " size="7px"><b><u>ABES  ENGINEERING  COLLEGE</u></b></font></u>

</div>

</div>


<div class="navbar">
  <a href="home.html">Home</a>
  <a href="Createaccount.html">Registration</a>
  <div class="dropdown">
    <button class="dropbtn">Login As 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="loginadmin.html">Admin</a>
      <a href="loginstudent.html">Student</a>
      <a href="loginfaculty.html">Faculty</a>
   </div>
  </div> 
  
  <a href="AdmissionEnquiry.jsp">Admission Enquiry</a>
<a href="Academics.jsp">Academics</a>

<a href="Placement.jsp">Placement</a>
<a href="Contact.jsp">ContactUs</a>
</div>


<div class="container">
  <h1 align="center" style="color:red"><b><u>Faculty's Details</u></b></h1>
    <table class="table table-striped" border="1" >
    <thead>
      <tr>
        <th>Faculty Name</th>
       
        <th>Email Id</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>Address</th>
        <th>Designation</th>
        <th>Salary</th>
        <th>Phone Number</th>
        <th>Department Id</th>
        <th>Department</th>
        <th>Date Of Joining</th>
       
        </tr>
    </thead>
<%
String str=(String)session.getAttribute("s2");
if(str.equals("1"))
{
ArrayList <FacultyBean> al=(ArrayList)session.getAttribute("s1");
Iterator <FacultyBean> it=al.iterator();
while(it.hasNext())
 {
	FacultyBean s=(FacultyBean)it.next();
	 //out.println(s);
%>
<tbody>
      <tr>
        <td><%=s.getFaculty_name() %></td>
        <td><%=s.getEmail_id()%></td>
        <td><%=s.getDOB()%></td>
        <td><%=s.getGender() %></td>
        <td><%=s. getAddress() %></td>
        <td><%=s.getDesignation() %></td>
         <td><%=s.getSalary() %></td>
        <td><%=s.getPhone_number()%></td>
        <td><%=s.getDepartment_id() %></td>
        <td><%=s.getDepartment() %></td>
        <td><%= s.getDOJ()%></td>
        
      </tr>
    </tbody>
   
 <%
 }
}
else
{
	FacultyBean s=(FacultyBean)session.getAttribute("s3");
 %>
 
 <tbody>
      <tr>
        <td><%=s.getFaculty_name() %></td>
        <td><%=s.getEmail_id()%></td>
        <td><%=s.getDOB()%></td>
        <td><%=s.getGender() %></td>
        <td><%=s. getAddress() %></td>
        <td><%=s.getDesignation() %></td>
         <td><%=s.getSalary() %></td>
        <td><%=s.getPhone_number()%></td>
        <td><%=s.getDepartment_id() %></td>
        <td><%=s.getDepartment() %></td>
        <td><%= s.getDOJ()%></td>
       
      </tr>
    </tbody>
    

 <%
 }

 %>
  <form action="FacultyDetailsDisplay.html"> 
<button type="submit" class="button" style="background-color:#008CBA;">Back</button>
</form>
 
    

</div>
</body>
</html>

<!-- http://www.java67.com/2012/12/how-to-convert-sql-date-to-util-date.html -->