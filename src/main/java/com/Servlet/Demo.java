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
			String password = req.getParameter("password");
			
			
			User u = new User(fullName , email , password );
			
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
