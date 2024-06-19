package com.Admin;

import java.io.IOException;



import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/admin_register")
public class AdminLogin extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2255245429613140118L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			HttpSession session = req.getSession();
			
			if("admin@gmail.com".equals(email) && "admin".equals(password))
			{
				session.setAttribute("adminObj", new User());
				resp.sendRedirect("admin/index.jsp");
			}
			else {
				session.setAttribute("errMsg", "invalid Email or Password");
				resp.sendRedirect("admin_login.jsp");
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
