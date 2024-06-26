<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ page import="com.dao.DepartmentDao" %>
    <%@ page import="com.db.DBConnect" %>
    <%@ page import="com.entity.Department" %>
    <%@ page import="java.util.List" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Dashboard</title>
<%@include file ="../component/allcss.jsp" %>
</head>
<body>



                <%
    Object userObj = session.getAttribute("userObj");
    if (userObj == null) {
        response.sendRedirect("../user_login.jsp");
    }
%>
<%@include file ="navbar.jsp" %>
<%@include file ="addAppointment.jsp" %>


   
    
     
	
<h1>User login</h1>

</body>
</html>