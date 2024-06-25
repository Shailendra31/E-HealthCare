<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Profile</title>
<%@include file ="../component/allcss.jsp" %>
</head>
<body>
<%@include file ="navbar.jsp" %>

               <li>
                    <a class="nav-link" href="../doctorLogout"><i class="fa-solid fa-arrow-right-to-bracket"></i>Logout</a>
                </li>
                <%
    Object docObj = session.getAttribute("docObj");
    if (docObj == null) {
        response.sendRedirect("../doctor_login.jsp");
    }
%>
                

</body>
</html>