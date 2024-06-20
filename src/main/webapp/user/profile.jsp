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

               <li>
                    <a class="nav-link" href="../userLogout"><i class="fa-solid fa-arrow-right-to-bracket"></i>Logout</a>
                </li>
                <%
    Object userObj = session.getAttribute("userObj");
    if (userObj == null) {
        response.sendRedirect("../user_login.jsp");
    }
%>
                

</body>
</html>