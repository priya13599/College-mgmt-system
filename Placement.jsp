<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Placement Status</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="home.css">
<link rel="stylesheet" href="login.css">
<script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/F83F6E00-42FF-4741-B1BD-B18C2DE9CA81/main.js" charset="UTF-8"></script>
<style>

* {
    box-sizing: border-box;
}

.column {
 white-space: nowrap; 
    float: left;
    width: 33.33%;
    padding: 5px;
}


/* Clearfix (clear floats) */
.row::after {
    
    display: table;
}


/* Responsive layout - makes the three columns stack on top of each other instead of next to each other */
@media screen and (max-width: 500px) {
    .column {
        width: 100%;
    }
}



</style>
</head>

<body style="background-color:black;">
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

<form class="modal-content" style ="margin-left: 935px;margin-top:120px;position:absolute;"  action="ControllerPlacementReport2016">
    <div class="container">
      <h1>Placement Report</h1>
    
      <hr>
      <input type="text" placeholder="Enter Year between 2016 to 2017" name="year" required>

   

      <div class="clearfix">
      <TABLE>
      <TR>
      <TD>
         <input type="submit" class="signupbtn" value="B.TECH" name ="c1" />
         </TD>
         <TD>
         <input type="submit" class="signupbtn" value="MCA" name ="c1" />
         </TD>
         </TR>
        </TABLE>
      </div>
    </div>
  </form>


<h1 style="color:red; margin-top: 60px;">TOP PLACEMENT COMPANIES </h1>

<div class="row">
  <div class="column">
    <img src="capegimini.png"  style="width:40%; ">
  </div>
  <div class="column">
    <img src="nec.png" style="width:40%; margin-left:-250px;">
  </div>
  <div class="column">
    <img src="tech-m.png"  style="width:40%; margin-left:-500px;">
  </div>
   
</div>


<div class="row">
  <div class="column">
    <img src="sapient.png"  style="width:40%; ">
  </div>
  <div class="column">
    <img src="ibm.png"  style="width:40%; margin-left:-250px;">
  </div>
  <div class="column">
    <img src="bt.png"  style="width:40%;  margin-left:-500px;">
  </div>
</div>


<div class="row">
  <div class="column">
    <img src="cadence.png"  style="width:40%; ">
  </div>
  <div class="column">
    <img src="josh-tech.png"  style="width:40%; margin-left:-250px;">
  </div>
  <div class="column">
    <img src="kone.png"  style="width:40%;  margin-left:-500px;">
  </div>
</div>


</body>
</html>