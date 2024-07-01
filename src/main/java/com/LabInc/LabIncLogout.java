package com.LabInc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/labIncLogout")
public class LabIncLogout extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    
		 HttpSession session = req.getSession();
		 session.removeAttribute("labObj");
		 session.setAttribute("sucMsg", " Logout ");
		 
		 resp.sendRedirect("LabInc_login.jsp");
		 
		
		
	}


}
