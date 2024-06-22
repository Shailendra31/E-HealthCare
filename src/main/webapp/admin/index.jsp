<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<%@include file ="../component/allcss.jsp" %>
<style>

.main{

 display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 20px;
    
}
.card {
    width: 300px;
    height: 200px;
    background-color: yellow;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
    overflow: hidden;
    position: relative;
    transition: height 0.3s ease;
    margin: 10px;
}

.card:hover {
    height: 200px;
}

.card-content, .form-content {
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    transition: opacity 0.3s ease;
}

.form-content {
    opacity: 0;
    pointer-events: none;
}

.card:hover .form-content {
    opacity: 1;
    pointer-events: auto;
}

.card:hover .card-content {
    opacity: 0;
    pointer-events: none;
}

form {
    display: flex;
    flex-direction: column;
    gap: 10px;
}

input, button {
    padding: 10px;
    font-size: 16px;
    border-radius: 4px;
    border: 1px solid #ccc;
}

button {
    background-color: #007BFF;
    color: white;
    cursor: pointer;
}

button:hover {
    background-color: #0056b3;
}

</style>

</head>
<body>

	<%@include file ="navbar.jsp" %>
	

<%
    Object adminObj = session.getAttribute("adminObj");
    if (adminObj == null) {
        response.sendRedirect("../admin_login.jsp");
    }
%>


   <div class="main">
    <div class="card">
        <div class="card-content">
            <h2>Doctor</h2>
        </div>
        <div class="form-content">
            <form id="hoverForm">
                <button type="submit">ADD</button>
            </form>
        </div>
    </div>
    
    
    
        <div class="card">
        <div class="card-content">
            <h2>Departments</h2>
        </div>
        <div class="form-content">
            <form action ="../add_dept" method="post"  id="hoverForm">
                <label for="name">Departments:</label>
                <input type="text" id="department" name="department" required>
                <button type="submit" >ADD</button>
            </form>
        </div>
    </div>
   
   </div>




</body>
</html>