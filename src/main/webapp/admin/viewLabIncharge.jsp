<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.dao.LabInchargeDao" %>
    <%@ page import="com.db.DBConnect" %>
    <%@ page import="com.entity.LabIncharge" %>
    <%@ page import="java.util.List" %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View LabIncharges</title>
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
        <h2>Lab Incharge Information</h2>
        <table>
            <thead>
                <tr>
                    <th scope="col">LID</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">DOB</th>
                    <th scope="col">Laboratory</th>
                    <th scope="col">Email</th>
                    <th scope="col">Mobile No</th>
                    
                </tr>
            </thead>
            <tbody>
            
               <%
                  LabInchargeDao dao1 = new LabInchargeDao(DBConnect.getConn());
   			      List<LabIncharge> list =dao1.getAllLabIncharge();
   			      for(LabIncharge l :list)
   			   {%>
   			   
   			    <tr>
                    <td><%= l.getLid() %></td>
                    <td><%= l.getFirst_name() %></td>
                    <td><%= l.getLast_name() %></td>
                    <td><%= l.getDob() %></td>
                    <td><%= l.getLab() %>
                    <td><%= l.getEmailaddress() %></td>
                    <td><%= l.getMobile() %></td>
                </tr>
               <%} 
               
               %>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>