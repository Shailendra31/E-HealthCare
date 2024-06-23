<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.DoctorDao" %>
    <%@ page import="com.db.DBConnect" %>
    <%@ page import="com.entity.Doctor" %>
    <%@ page import="java.util.List" %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Doctor</title>
<%@include file ="../component/allcss.jsp" %>
    <style>
 .mainCard {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: #f0f0f0;
        }
        
        h2{
        text-align : center;
        }
        .cardI {
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            width: 80%;
            max-width: 800px;
            margin: 20px;
            padding: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            padding: 12px;
            border-bottom: 1px solid #ddd;
            text-align: left;
        }
        th {
            background-color: #f8f8f8;
        }
    </style>
    
 </head>   
<body>


	<%@include file ="navbar.jsp" %>
<div class ="mainCard">	
    <div class="cardI">
        <h2>Doctors Information</h2>
        <table>
            <thead>
                <tr>
                    <th>RID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>DOB</th>
                    <th>Email</th>
                    <th>Mobile No</th>
                    
                </tr>
            </thead>
            <tbody>
            
               <%
                  DoctorDao dao2 = new DoctorDao(DBConnect.getConn());
   			      List<Doctor> list =dao2.getAllDoctor();
   			      for(Doctor d:list)
   			   {%>
   			   
   			    <tr>
                    <td><%= d.getRid() %></td>
                    <td><%=d.getFirstname() %></td>
                    <td><%=d.getLastname() %></td>
                    <td><%=d.getDob() %></td>
                    <td><%= d.getEmailaddress() %></td>
                    <td><%=d.getMobile() %></td>
                   <td>
                   <a href="#" class "btn btn-sm btn-primary">Edit</a>
                   <a href="#" class "btn btn-sm btn-primary">Delete</a>  
                    </td>
                </tr>
               <%} 
               
               %>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>