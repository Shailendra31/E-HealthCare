<%@page import = "com.db.DBConnect" %>
<%@page import ="java.sql.Connection" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	

	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<%@include file ="component/allcss.jsp" %>

</head>
<body>
	<%@include file ="component/navbar.jsp" %>
	<%@include file ="component/Emergency.jsp" %>
	
	<%@include file ="component/hero.jsp" %>
	<%@include file ="component/department.jsp" %>
	
	<%@include file ="component/About.jsp" %>
	<%@include file ="component/footer.jsp" %>
	
	
	
	
</body>
</html>