
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signup </title>
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
        
        .error {
            color: red;
            display: none;
        }
    </style>
<%@ include file="component/allcss.jsp" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<%@ include file="component/navbar.jsp" %>
 <div class="container login-container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="login-box">
                    <h2 class="text-center">User Register</h2>
                    <c:if test="${not empty sucMsg }" >
                    	<p class="text-center text-success fs-5 ">${sucMsg}</p>
                    	<c:remove var="sucMsg" scope="session"/>
                    </c:if>
                     <c:if test="${not empty errorMsg }" >
                    	<p class="text-center text-success fs-5 ">${errorMsg}</p>
                    	<c:remove var="errorMsg" scope="session"/>
                    </c:if>
                    <form action="user_register" method="post" id="passwordForm">
                        <div class="form-group position-relative">
                            <label for="username">Full Name</label>
                            <input type="text" id="username" name="username" class="form-control" required>
                            <i class="fa fa-user"></i>
                        </div>
                          <div class="form-group position-relative">
                            <label for="emailaddress">Email Address</label>
                            <input type="email" id="emailaddress" name="emailaddress" class="form-control" required>
                            <i class="fa fa-user"></i>
                        </div>
                        <div class="form-group position-relative">
                            <label for="password">Password</label>
                            <input type="password" id="password" name="password" class="form-control" minlength="5" required>
                            
                            <i class="fa fa-lock"></i>
                        </div>
                        <small class="error" id="error">Password must be at least 5 characters long and contain at least one special character.</small>
                       
                        <button type="submit" class="btn btn-custom btn-block text-bg-success p-3">Register</button>
                         
                    </form>
                </div>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        document.getElementById('passwordForm').addEventListener('submit', function(event) {
            const passwordInput = document.getElementById('password');
            const password = passwordInput.value;
            const errorElement = document.getElementById('error');
            const specialCharacterPattern = /[!@#$%^&*(),.?":{}|<>]/;

            if (password.length < 5 || !specialCharacterPattern.test(password)) {
                errorElement.style.display = 'inline';
                event.preventDefault();
            } else {
                errorElement.style.display = 'none';
            }
        });
    </script>
  
</body>
</html>