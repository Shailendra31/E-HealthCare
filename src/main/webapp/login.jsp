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
  
  <div class="d-flex justify-content-center mt-10">
  <div class="row row-cols-1 row-cols-md-2 g-4 text-center shadow p-3 mb-5 bg-body-tertiary rounded">
  <div class="col ">
    <div class="card shadow bg-body-tertiary rounded bg-warning">
     
      <div class="card-body ">
        <h5 class="card-title">Doctor Login</h5>
        <a href="doctor_login.jsp" class="btn btn-primary">Login</a>
        </div>
    </div>
  </div>
  <div class="col">
    <div class="card shadow bg-body-tertiary rounded bg-warning">
      
      <div class="card-body">
        <h5 class="card-title">Admin Login</h5>
        <a href="admin_login.jsp" class="btn btn-primary">Login</a>
         </div>
    </div>
  </div>
  <div class="col">
    <div class="card shadow bg-body-tertiary rounded bg-warning bg-warning">
      
      <div class="card-body">
        <h5 class="card-title">User Login</h5>
        <a href="user_login.jsp" class="btn btn-primary ">Login</a>
        </div>
    </div>
  </div>
  <div class="col">
    <div class="card shadow bg-body-tertiary rounded bg-warning">
      
      <div class="card-body">
        <h5 class="card-title">Laboratory</h5>
        <a href="#" class="btn btn-primary">Login</a>
        </div>
    </div>
  </div>
  
  <div class="col">
    <div class="card shadow bg-body-tertiary rounded bg-warning">
      
      <div class="card-body">
        <h5 class="card-title">Ward Master</h5>
        <a href="#" class="btn btn-primary">Login</a>
        </div>
    </div>
  </div>
  
  
  
  
</div>
</div>
</body>
</html>