<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file ="../component/allcss.jsp" %>
</head>
<body>

	<%@include file ="navbar.jsp" %>
	

<%
    Object adminObj = session.getAttribute("adminObj");
    if (adminObj == null) {
        response.sendRedirect("../admin_login.jsp");
    }
%>


	
<h1>Admin login</h1>


</body>
</html>