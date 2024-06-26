package com.Servlet;

import java.io.IOException;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Demo extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6386731118660961971L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
			
			
			String fullName = req.getParameter("username");
			
			String email = req.getParameter("emailaddress");
			
			String gender = req.getParameter("gender");
			
			
			String dob = req.getParameter("dob");
			
			int age = Integer.parseInt(req.getParameter("age"));
			
			String phoneNo = req.getParameter("phoneNo");
			
			
			String country = req.getParameter("country");
			
			String state = req.getParameter("state");

			
			String district = req.getParameter("dist");
			
			String area = req.getParameter("area");
			
			
			String pincode = req.getParameter("pin");
			
			String password = req.getParameter("password");
			
			
			User u = new User(fullName,email , gender , dob , age , phoneNo, country , state ,district ,area ,pincode ,password);
			
			UserDAO dao = new UserDAO(DBConnect.getConn());
			
			HttpSession session = req.getSession();
			
			
			boolean f = dao.register(u);
			
			
			
			if(f)
			{
				session.setAttribute("sucMsg" , "Register Sucessfully");
				
				resp.sendRedirect("signup.jsp");
				
			}
			else {
					
				session.setAttribute("errorMsg" , " Somthing Went Wrong");
				
				resp.sendRedirect("signup.jsp");
				}
			
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
