<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Academics</title>
<link rel="stylesheet" href="home.css">
<style>

* {
    box-sizing: border-box;
}

.column {
    float: left;
    width: 33.33%;
    padding: 5px;
}
.column1 {
    float: left;
    width: 20.33%;
    padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
    content: "";
    clear: both;
    display: table;
}


/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width: 500px) {
    .column {
        width: 100%;
    }
}
table
{
background:rgba(0,0,0,0.5);
position:absolute;
}


</style>
</head>

<body style="background-color:black" >
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


<p style="color:red;"><strong><b>At ABESEC students learn the skills and acquire knowledge for entering the professional world with confidence. Clear motives and a powerful self image helps students face the world with confidence and belief.</b></strong></p>
<div class="row">
  <div class="column">
    <img src="cs.jpg"  style="width:100%; height:260px;">
  </div>
  <div class="column">
    <img src="aca.jpg"  style="width:100%;height:260px;">
  </div>
  <div class="column">
    <img src="electronics.jpg"  style="width:100%;height:260px;">
  </div>
</div>
<center><h1 style="color:red"><b> <u>PROGRAMS OFFERED</u> </b></h1></center>
<div class="row1">
<h2 style="color:red;margin-left:130px"><b> <u> UNDER GRADUATE</u> </b></h2>
<table  border ="5" bordercolor="orange">
<thead>
<tr style=" background-color:orange;color:white">
<th>Name of the Branch</th>
<th>Branch Code</th>
<th>Duration</th>
<th>Seats</th>
</tr>
</thead>
<tbody  style="color:orange">
<tr>
<td data-title="Name of the Branch">Civil Engineering</td>
<td data-title="Branch Code">CE</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats">120</td>
</tr>
<tr>
<td data-title="Name of the Branch">Computer Engineering &amp; Information Technology</td>
<td data-title="Branch Code">CEI</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats"> 60</td>
</tr>
<tr>
<td data-title="Name of the Branch">Computer Science &amp; Engineering</td>
<td data-title="Branch Code">CSE</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats">180</td>
</tr>
<tr>
<td data-title="Name of the Branch">Electronics &amp; Communication Engineering</td>
<td data-title="Branch Code">ECE</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats">180</td>
</tr>
<tr>
<td data-title="Name of the Branch">Electrical &amp; Electronics Engineering</td>
<td data-title="Branch Code">EN</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats">120</td>
</tr>
<tr>
<td data-title="Name of the Branch">Information Technology</td>
<td data-title="Branch Code">IT</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats">180</td>
</tr>
<tr>
<td data-title="Name of the Branch">Mechanical Engineering</td>
<td data-title="Branch Code">ME</td>
<td data-title="Duration">4 years</td>
<td data-title="Seats">180</td>
</tr>
</tbody>
</table>
</div>


<div style="margin-left:1000px; margin-top:-45px">
<h2 style="color:red;margin-left:200px"><b> <u> POST GRADUATE</u> </b></h2>
<table border ="5" bordercolor="orange">
<thead >
<tr style=" background-color:orange;color:white">
<th>Name of the Branch</th>
<th>Branch Code</th>
<th>Duration</th>
<th>Seats</th>
</tr>
</thead>
<tbody  style="color:orange">
<tr>
<td data-title="Name of the Branch">Master of Business Administration</td>
<td data-title="Branch Code">MBA</td>
<td data-title="Duration">2 years</td>
<td data-title="Seats">120</td>
</tr>
<tr>
<td data-title="Name of the Branch">Master of Computer Application</td>
<td data-title="Branch Code">MCA</td>
<td data-title="Duration">3 years / 2 years (Lateral Entry)</td>
<td data-title="Seats">120</td>
</tr>
<tr>
<td data-title="Name of the Branch">Master of Technology (CSE)</td>
<td data-title="Branch Code">CSE</td>
<td data-title="Duration">2 years</td>
<td data-title="Seats">18</td>
</tr>
<tr>
<td data-title="Name of the Branch">Master of Technology (ECE)</td>
<td data-title="Branch Code">ECE</td>
<td data-title="Duration">2 years</td>
<td data-title="Seats">18</td>
</tr>
<tr>
<td data-title="Name of the Branch">Master of Technology (ME)</td>
<td data-title="Branch Code">ME</td>
<td data-title="Duration">2 years</td>
<td data-title="Seats">18</td>
</tr>
</tbody>
</table>



</div>
</body>
</html>