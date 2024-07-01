<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lab Incharge</title>
<%@include file ="../component/allcss.jsp" %>
 <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;

       
        }
        .login-container {
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            width:500px;
        

       
        }
        .login-box {
            background: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            width:400px;
           margin-right:300px;
          
           
         
        }
        .login-box h2 {
            margin-bottom: 30px;
            font-weight: 300;
            color: #343a40;
        }
        .form-control {
            border-radius: 5px;
            padding: 10px;
            margin-bottom: 20px;
            font-size: 16px;
            border: 1px solid #ced4da;
        }
        .btn-custom {
            background-color: #007bff;
            color: #fff;
            border-radius: 5px;
            font-size: 18px;
            padding: 10px;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
        .form-group {
            position: relative;
        }
        .form-group .fa {
            position: absolute;
            right: 15px;
            top: 40px;
            color: #aaa;
        }
        .text-center a {
            color: #007bff;
            text-decoration: none;
        }
        .text-center a:hover {
            text-decoration: underline;
        }
    </style>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<%@include file ="navbar.jsp" %>

                <%
    Object labObj = session.getAttribute("labObj");
    if (labObj == null) {
        response.sendRedirect("../LabInc_login.jsp");
    }
%>
<section class="text-gray-600 body-font">


  <div class="container mx-auto flex px-5 py-24 md:flex-row flex-col items-center">
  
  
    <div class="lg:max-w-lg lg:w-full md:w-1/2 w-5/6 mb-10 md:mb-0">
      <img class="object-cover object-center rounded" alt="hero" src="../img/report.webp">
    </div>
    
    
    <div class="lg:flex-grow md:w-1/2 lg:pl-24 md:pl-16 flex flex-col md:items-start md:text-left  ">
      <div class="container login-container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="login-box">
                    <h2 class="text-center">Upload Report</h2>
                    
                    
                    
                    
                    <form action="../uploadReport" method="post" enctype="multipart/form-data">
                    
                    
                         
                        
						
 						
 						                   
                         <div class="form-group position-relative">
                            <label for="disease">User Id</label>
                            <input type="text" id="uid" name="uid" class="form-control" required>
                          
                        </div>
                        
                        
                        <div class="form-group position-relative">
                            <label for="disease">User Name</label>
                            <input type="text" id="uname" name="uname" class="form-control" required>
                          
                        </div>
                        
                        
                         <div class="form-group position-relative">
                            <label for="disease">User email</label>
                            <input type="email" id="email" name="email" class="form-control" required>
                          
                        </div>
                        
                        <div class="form-group position-relative">
                            <label for="disease">User Report</label>
                            <input type="file" id="file" name="file" class="form-control" required>
                          
                        </div>
                        
                         <div class="form-group position-relative">
                            <label for="disease">Remark</label>
                            <input type="text" id="remark" name="remark" class="form-control" required>
                          
                        </div>
                        
                         
                        
                        
                        
                        
                        
                        <button type="submit" class="btn btn-custom btn-block text-bg-success p-3">UPLOAD</button>
                     
                    </form>
                </div>
            </div>
        </div>
    </div>
    </div>
  </div>
</section>
</body>
</html>