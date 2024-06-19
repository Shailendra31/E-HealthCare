<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<%@include file ="component/allcss.jsp" %>
</head>
<body>

   
  <%@include file ="component/navbar.jsp" %>
  
  <div style="display:flex ;justify-content: center ; margin:30px;">
  <div class="row row-cols-1 row-cols-md-2 g-4">
  <div class="col">
    <div class="card">
     
      <div class="card-body">
        <h5 class="card-title">Doctor Login</h5>
        <a href="doctor_login.jsp" class="btn btn-primary">Login</a>
        </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      
      <div class="card-body">
        <h5 class="card-title">Admin Login</h5>
        <a href="admin_login.jsp" class="btn btn-primary">Login</a>
         </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      
      <div class="card-body">
        <h5 class="card-title">User Login</h5>
        <a href="user_login.jsp" class="btn btn-primary">Login</a>
        </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      
      <div class="card-body">
        <h5 class="card-title">Appointment</h5>
        <a href="#" class="btn btn-primary">Get Appointment</a>
        </div>
    </div>
  </div>
</div>
</div>
</body>
</html>