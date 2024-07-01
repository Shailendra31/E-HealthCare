
 <%@ page import="com.Servlet.UserLogin" %>
           <%@ page import="com.entity.User" %>
<% User user1 = (User) session.getAttribute("userObj"); %>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary " >
    <div class="container-fluid d-flex justify-content-center">
        <!-- Logo -->
        <a class="navbar-brand active" href="#" style="width : 25%">
            <i class="fa-solid fa-stethoscope"></i> MEDI FRIEND
        </a>
        <!-- Center Links -->
        <div class="mx-auto d-flex justify-content-center">
            <ul class="navbar-nav d-flex justify-content-center">
                <li class="nav-item ">
                    <a class="nav-link active" href="index.jsp">Appointment</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="viewAppointment.jsp">View Appointment</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="contact.jsp">Report</a>
                </li>
            </ul>
        </div>
        <!-- Right Login Link -->
        <div class="d-flex ms-auto">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="#"><i class="fa-solid fa-user-large"></i> <%= user1.getFullname() %>  </a>
                </li>
                
               <li>
                    <a class="nav-link active" href="../userLogout"><i class="fa-solid fa-arrow-right-to-bracket"></i>Logout</a>
                </li>
               
            </ul>
        </div>
    </div>
</nav>


