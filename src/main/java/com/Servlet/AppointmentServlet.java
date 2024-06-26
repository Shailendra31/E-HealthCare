package com.Servlet;

import java.io.IOException;

import com.dao.AppointmentDao;
import com.db.DBConnect;
import com.entity.Appointment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/userAppointment")

public class AppointmentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -661289626826048968L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int uid = Integer.parseInt(req.getParameter("uid"));
		String diseases = req.getParameter("disease");
		String doa = req.getParameter("doa");
		int rid = Integer.parseInt(req.getParameter("spec"));
		
		Appointment ap = new Appointment(uid , diseases , doa ,rid , "Pending");
		AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
		
		HttpSession session = req.getSession();
		
		
		if(dao.addAppointment(ap)) {
			session.setAttribute("SuMsg", "Appointment Sucessful");
			resp.sendRedirect("user/index.jsp");
		}
		else {
			session.setAttribute("errorM", "no appointment");
			resp.sendRedirect("user/profile.jsp");
		}
		
	}

   
	
	

}
