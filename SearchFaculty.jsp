<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Bean.FacultyBean,java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<title>Search Status</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="home.css">

<script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/F83F6E00-42FF-4741-B1BD-B18C2DE9CA81/main.js" charset="UTF-8"></script>
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
        <th>Email_Id</th>
        <th>DOB</th>
        <th>Gender</th>
        <th>Address</th>
        <th>Designation</th>
        <th>Salary</th>
        <th>Phone Number</th>
        <th>Department_Id</th>
        <th>Department</th>
        <th>DOJ</th>
        
        </tr>
    </thead>
<%
SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
FacultyBean e1=(FacultyBean)session.getAttribute("s1");
if(e1==null)
{
	out.println("sorry record not found ");
}
else
{
	
	%>
	<tbody>
    <tr>
      <td><%=e1.getFaculty_name() %></td>
      <td><%=e1.getEmail_id()%></td>
      <td><%=e1.getDOB()%></td>
      <td><%=e1.getGender() %></td>
      <td><%= e1.getAddress() %></td>
      <td><%=e1.getDesignation() %></td>
      <td><%=e1.getSalary()%></td>
      <td><%=e1.getPhone_number() %></td>
      <td><%=e1.getDepartment_id()%></td>
      <td><%=e1.getDepartment() %></td>
      <td><%=e1.getDOJ()%></td>
      
     
    </tr>
  </tbody>
 <%
}

%>
<form action="FacultyDetailsSearch.html">
<button type="submit" class="button" style="background-color:#008CBA">Back</button>

</form>
</div>
</body>
</html>

<!-- http://www.java67.com/2012/12/how-to-convert-sql-date-to-util-date.html -->