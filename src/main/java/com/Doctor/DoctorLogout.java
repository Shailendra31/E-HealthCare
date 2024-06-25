package com.Doctor;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/doctorLogout")
public class DoctorLogout extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2379827321910919842L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    
		 HttpSession session = req.getSession();
		 session.removeAttribute("docObj");
		 session.setAttribute("sucMsg", "doctor Logout ");
		 
		 resp.sendRedirect("doctor_login.jsp");
		 
		
		
	}

}
