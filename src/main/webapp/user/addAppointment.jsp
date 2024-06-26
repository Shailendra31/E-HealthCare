     <%@ page import="com.dao.DoctorDao" %>
          <%@ page import="com.Servlet.UserLogin" %>
           <%@ page import="com.entity.User" %>
    <%@ page import="com.db.DBConnect" %>
    <%@ page import="com.entity.Doctor" %>
    <%@ page import="java.util.List" %>
  
  <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;

       
        }
        .login-container {
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            width:500px;
        

       
        }
        .login-box {
            background: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            width:400px;
           margin-right:300px;
          
           
         
        }
        .login-box h2 {
            margin-bottom: 30px;
            font-weight: 300;
            color: #343a40;
        }
        .form-control {
            border-radius: 5px;
            padding: 10px;
            margin-bottom: 20px;
            font-size: 16px;
            border: 1px solid #ced4da;
        }
        .btn-custom {
            background-color: #007bff;
            color: #fff;
            border-radius: 5px;
            font-size: 18px;
            padding: 10px;
        }
        .btn-custom:hover {
            background-color: #0056b3;
        }
        .form-group {
            position: relative;
        }
        .form-group .fa {
            position: absolute;
            right: 15px;
            top: 40px;
            color: #aaa;
        }
        .text-center a {
            color: #007bff;
            text-decoration: none;
        }
        .text-center a:hover {
            text-decoration: underline;
        }
    </style>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<section class="text-gray-600 body-font">


  <div class="container mx-auto flex px-5 py-24 md:flex-row flex-col items-center">
  
  
    <div class="lg:max-w-lg lg:w-full md:w-1/2 w-5/6 mb-10 md:mb-0">
      <img class="object-cover object-center rounded" alt="hero" src="../img/appoinntment.png">
    </div>
    
    
    <div class="lg:flex-grow md:w-1/2 lg:pl-24 md:pl-16 flex flex-col md:items-start md:text-left  ">
      <div class="container login-container">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <div class="login-box">
                    <h2 class="text-center">Appointment</h2>
                    
                    
                    
                    
                    <form action="../userAppointment" method="post">
                    
                    
                         
                         <%
							    User userObj1 = (User) session.getAttribute("userObj");
							    String userId = (userObj1 != null) ? String.valueOf(userObj1.getId()) : "";
							%>
						<input type="hidden" name="uid" value="<%= userId %>">

 						
 						                   
                         <div class="form-group position-relative">
                            <label for="disease">Disease</label>
                            <input type="text" id="disease" name="disease" class="form-control" required>
                          
                        </div>
                        
                         <div class="form-group position-relative">
                            <label for="doa">Date of Appointment</label>
                            <input type="date" id="doa" name="doa" class="form-control" >
                           
                        </div>
                        
                          <div class="form-group position-relative">
                            <label for="dep">Doctor/Department</label>
                            <select name="spec" required class="form-control">
                            <option>--select--</option>
                            
                            <%
                           
                              DoctorDao dao4 = new DoctorDao(DBConnect.getConn());
             			      List<Doctor> list =dao4.getAllDoctor();
             			      for(Doctor d:list)
             			   {%>
             			   
             			   <option value="<%= d.getRid()%>"> <%=d.getFirstname() %> <%=d.getLastname() %> (<%= d.getDepartment() %>)</option>
                            
                            <%}
                            %>
                            </select>
                            
                            
                        </div>
                        
                        
                        
                        
                        <button type="submit" class="btn btn-custom btn-block text-bg-success p-3">Get Appointment</button>
                     
                    </form>
                </div>
            </div>
        </div>
    </div>
    </div>
  </div>
</section>