package com.Servlet;

import java.io.IOException;

import com.dao.AppointmentDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/delete_Appointment")
public class DeleteAppointment extends HttpServlet {

	
	private static final long serialVersionUID = 5611153330000341800L;




	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			
			int aid = Integer.parseInt(req.getParameter("aid"));
			
			
			
			
			AppointmentDao dao = new AppointmentDao(DBConnect.getConn());
			boolean f = dao.deleteAppointment(aid);
			
			HttpSession session = req.getSession();
			
			if(f)
				
			{
				session.setAttribute("success", " Appointment deleted");
				resp.sendRedirect("user/viewAppointment.jsp");
				
			}
			
			else {
				session.setAttribute("error", "Appointment not deleted");
				resp.sendRedirect("user/viewAppointment.jsp");
				
			}
			
		}
		
		catch(Exception  e)
		{
		   e.printStackTrace();
		 }
	}
		

}
