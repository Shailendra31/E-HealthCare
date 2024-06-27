<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="com.dao.DoctorDao" %>
            <%@ page import="com.dao.UserDAO" %>
            <%@ page import="com.dao.AppointmentDao" %>
          <%@ page import="com.Servlet.UserLogin" %>
           <%@ page import="com.entity.User" %>
    <%@ page import="com.db.DBConnect" %>
    <%@ page import="com.entity.Doctor" %>
     <%@ page import="com.entity.Appointment" %>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Appointment</title>
<%@include file ="../component/allcss.jsp" %>
</head>
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
<body>


<%@include file ="navbar.jsp" %>
<div class ="mainCard">	
    <div class="cardI">
        <h2>Appointment Information</h2>
        <table>
            <thead>
                <tr>
                
                
                   <th scope="col">Patient Name</th>
                   <th scope="col">Age</th>
                   <th scope="col">Gender</th>
               	   <th scope="col">Diseases</th>
                    <th scope="col">Date of Appointment</th>
                   
                    <th scope="col">Status</th>
                    <th scope="col">Action</th>
                    
                </tr>
            </thead>
            <tbody>
             
               <%
                  Doctor doctor = (Doctor) session.getAttribute("docObj");
                  AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
                  UserDAO doa2 = new UserDAO(DBConnect.getConn());
                  List<Appointment> list = dao.getAllAppointmentByDoctorId(doctor.getRid());
                  for(Appointment ap : list)
               
   			   {  User u = doa2.getUserById(ap.getUid());
   			   %>
   			   
   			    <tr>
                    <td><%= u.getFullname() %></td>
                    <td><%= u.getAge() %></td>
                    <td><%= u.getGender() %></td>
                    
                    <td><%= ap.getDiseases() %></td>
                    <td><%= ap.getDoa() %></td>
                    
                    
                    <td>
                    <% if ("Pending".equals(ap.getStatus()))
                    	{
                    	%>
                      <a href ="#" class= "btn btn-sm btn-warning">Pending</a>
                      
                      <%
                    	}else{
                      %> <%=ap.getStatus() %>
                   
                   <%}
                    %>
                   <td>
                    <a href="viewPatient.jsp?uid=<%= ap.getUid() %>" class ="btn btn-sm btn-danger">View Patient</a>  
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