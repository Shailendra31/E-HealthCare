package com.Servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/userLogout")
public class UserLogout extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3060304320095346728L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    
		 HttpSession session = req.getSession();
		 session.removeAttribute("userObj");
		 session.setAttribute("sucMsg", "User Logout ");
		 
		 resp.sendRedirect("user_login.jsp");
		 
		
		
	}
	

}
