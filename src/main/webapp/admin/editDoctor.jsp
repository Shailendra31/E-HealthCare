<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.dao.DoctorDao" %>
        <%@ page import="com.dao.DepartmentDao" %>
         <%@ page import="com.entity.Doctor" %>
    <%@ page import="com.db.DBConnect" %>
    <%@ page import="com.entity.Department" %>
    <%@ page import="java.util.*" %>
   <%@ page import="java.lang.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Doctor</title>
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
        
        .error {
            color: red;
            display: none;
        }
        </style>
        
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<%@include file ="navbar.jsp" %>
	
	 <div class="container login-container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="login-box">
                    <h2 class="text-center">Edit Doctor</h2>
                    
                    <%
                       int rid = Integer.parseInt(request.getParameter("rid"));
                       DoctorDao dao3= new DoctorDao(DBConnect.getConn());
                       Doctor d=  dao3.getDoctorById(rid);
                    
                    %>
                    
                    
                    
                    
                    <form action="../update_Doctor" method="post" id="edit">
                    
                    
                    
                    
                    
                    
                        <div class="form-group position-relative">
                            <label for="firstname">First Name</label>
                            <input type="text" id="username" name="firstname" class="form-control" required
                            value="<%=d.getFirstname()%>">
                           
                        </div>
                        
                         <div class="form-group position-relative">
                            <label for="lastname">Last Name</label>
                            <input type="text" id="lastname" name="lastname" class="form-control" 
                            value="<%=d.getLastname()%>">
                           
                        </div>
                        
                          <div class="form-group position-relative">
                            <label for="dob">DOB</label>
                            <input type="date" id="dob" name="dob" class="form-control"
                            value="<%= d.getDob() %>" >
                           
                        </div>
                        
                        <div class="form-group position-relative">
                            <label for="dob">Department</label>
                            <select name="spec" required class="form-control">
                            <option><%= d.getDepartment() %></option>
                            
                            <%
                            DepartmentDao dao1 = new DepartmentDao(DBConnect.getConn());
             			      List<Department> list1 =dao1.getAllDepartment();
             			      for(Department  s:list1){
             			    	  
             			      %>
             			  
                            <option><%=s.getDepartment() %></option>
                            <%}
                            %>
                            </select>
                            
                            
                        </div>
                        
                        
                        
                          <div class="form-group position-relative">
                            <label for="emailaddress">Email Address</label>
                            <input type="email" id="emailaddress" name="emailaddress" class="form-control" required
                            
                            value="<%= d.getEmailaddress()%>">
                          
                        </div>
                        
                        
                        <div class="form-group position-relative">
                            <label for="mobile">Mobile No</label>
                            <input type="text" id="mobile" name="mobile" class="form-control" minlength="10" required
                            value="<%=d.getMobile()%>">
                            
                        </div>
                        
                         <div class="form-group position-relative">
                            <label for="password">Password</label>
                            <input type="text" id="password" name="password" class="form-control" minlength="10" required
                            value="<%=d.getPassword()%>">
                            
                        </div>
                        
                        <input type="hidden" name="rid" value="<%= d.getRid() %>">
                        
                        
                        <small class="error" id="error">Password must be at least 10 characters long and contain at least one special character.</small>
                       
                       
                       <button type="submit" class="btn btn-custom btn-block text-bg-success p-3">Update</button>
                         
                        
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