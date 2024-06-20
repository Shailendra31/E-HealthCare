<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    Object userObj = session.getAttribute("userObj");
    if (userObj == null) {
        response.sendRedirect("../user_login.jsp");
    }
%>
     
	
<h1>User login</h1>

</body>
</html>