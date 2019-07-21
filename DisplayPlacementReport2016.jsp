<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Bean.PlacementReport2016,java.util.* " %>
<!DOCTYPE html>
<html>
<head>
<title>Search Status</title>
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
 <table class="table table-striped" border="1"  >
    <thead style="background-color:black" >
      <tr style="color:white">
        <th>Roll_No</th>
        <th>Student Name</th>
        <th>Branch</th>
        <th>Company Name</th>
        </tr>
    </thead>
    <center><h1 style="color:red"> <b><u>Placed Student's Details</u></b></h1></center>
<%
ArrayList <PlacementReport2016> al=(ArrayList)session.getAttribute("s1");
Iterator it=al.iterator();
while(it.hasNext())
 {
	 PlacementReport2016 s=(PlacementReport2016)it.next();
 %>
	<tbody>
      <tr>
      <td><%=s.getRoll_No() %>
        <td><%=s.getName() %></td>
        <td><%=s.getBranch() %></td>
        <td><%=s.getCompany_Name() %></td>
      
       
      </tr>
    </tbody>
    
<%
}

%>
</table>
<form action="Placement.jsp">
<center><button type="submit" class="button" style="background-color:#008CBA">Back</button></center>
</form>
</div>
</body>
</html>

<!-- http://www.java67.com/2012/12/how-to-convert-sql-date-to-util-date.html -->