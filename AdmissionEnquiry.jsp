<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Admission Enquiry</title>
<link rel="stylesheet" href="home.css">
<style>
body
{
background-image:url("college.jpg");
background-size:cover;
background-repeat:no-repeat;

}
table
{
background:rgba(0,0,0,0.5);
}
</style>
</head>
<body>
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

<center>
<h1 style="color:red"> ADMISSION ENQUIRY </h1>
<table border ="5" bordercolor="black" style=" font-size:25px">
<tr style=" background-color:orange;color:white;">
<th >
SNo.
</th>
<th>
COURSE
</th>
<th>
BRANCH
</th>
<th>
MOBILE NO.
</th>
</tr>
<tbody style="color:orange">
<tr>
<td data-title="S.No">1.</td>
<td data-title="Course">B Tech 1st Year(Direct Admission)</td>
<td data-title="Branch">All Branch</td>
<td data-title="Mobile No">8448494111</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td rowspan="6" data-title="Course">B.Tech (Lateral) 2nd Year</td>
<td data-title="Branch">Civil Engineering</td>
<td data-title="Mobile No">9643935440</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td data-title="Branch">Computer Science &amp; Engineering</td>
<td data-title="Mobile No">9711191186</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td data-title="Branch">Electronics and Communication Engineering</td>
<td data-title="Mobile No">8860092372</td>
</tr>
<tr>
<td data-title="S.No">2.</td>
<td data-title="Branch">Electrical and Electronics Engineering</td>
<td data-title="Mobile No">8860092371</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td data-title="Branch">Information Technology</td>
<td data-title="Mobile No">8860092367</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td data-title="Branch">Mechanical Engineering</td>
<td data-title="Mobile No">7982827629</td>
</tr>
<tr>
<td data-title="S.No">3.</td>
<td data-title="Course">MBA</td>
<td data-title="Branch"></td>
<td data-title="Mobile No">8448494111</td>
</tr>
<tr>
<td data-title="S.No">4.</td>
<td data-title="Course">MCA</td>
<td data-title="Branch"></td>
<td data-title="Mobile No">8448494111</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td rowspan="3" data-title="Course">M.Tech</td>
<td data-title="Branch">Computer Science &amp; Engineering</td>
<td data-title="Mobile No">9711004991</td>
</tr>
<tr>
<td data-title="S.No">5.</td>
<td data-title="Branch">Electronics and Communication Engineering</td>
<td data-title="Mobile No">8860092372</td>
</tr>
<tr>
<td data-title="S.No"></td>
<td data-title="Branch">Mechanical Engineering</td>
<td data-title="Mobile No">8860092368</td>
</tr>
</tbody>
</table>
</center>
</body>
</html>