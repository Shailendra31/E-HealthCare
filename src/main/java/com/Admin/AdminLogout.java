package com.Admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/adminLogout")
public class AdminLogout extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8495484430652238604L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		session.removeAttribute("adminObj");
		
		session.setAttribute("succMsg", "Admin Logout Succesfully ");
		resp.sendRedirect("admin_login.jsp");
	}
	

}
