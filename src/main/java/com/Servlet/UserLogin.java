package com.Servlet;

import java.io.IOException;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;




@WebServlet("/userLogin")
public class UserLogin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8768272866346387119L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			
			HttpSession session = req.getSession();
			
			UserDAO dao = new UserDAO(DBConnect.getConn());
			User user =dao.login(email, password);
			
			if(user != null)
			{
				session.setAttribute("userObj", user);
				resp.sendRedirect("user/index.jsp");
			}
			else {
				session.setAttribute("errorMsg", "Invalid Email or Password");
				resp.sendRedirect("user_login.jsp");
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
