package com.Doctor;

import java.io.IOException;

import com.dao.DoctorDao;
import com.db.DBConnect;
import com.entity.Doctor;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/doctorLogin")
public class DoctorLogin extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8795132669168206124L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			
			String email = req.getParameter("demail");
			String password = req.getParameter("dpassword");
			
			
			HttpSession session = req.getSession();
			
			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			Doctor d =dao.doctorLogin(email , password);
			
			if(d != null)
			{
				session.setAttribute("docObj", d);
				resp.sendRedirect("doctor/index.jsp");
			}
			else {
				session.setAttribute("errorMsg", "Invalid Email or Password");
				resp.sendRedirect("doctor_login.jsp");
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}	}
	
	
	

}
