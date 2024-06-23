package com.Admin;

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



@WebServlet("/doctor_register")
public class AddDoctor extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -568257686280368889L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			
			String rid = req.getParameter("rid");
			String firstname = req.getParameter("firstname");
			String lastname = req.getParameter("lastname");
			String dob = req.getParameter("dob");
			String email = req.getParameter("emailaddress");
			String mobile = req.getParameter("mobile");
			String password = req.getParameter("password");
			
			
			Doctor d = new Doctor(rid,firstname ,lastname, dob , email, mobile , password);
			
			
			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			HttpSession session = req.getSession();
			
			
			
			boolean f = dao.registerDoctor(d);
			if(f)
				
			{
				session.setAttribute("success", "Doctor registered");
				resp.sendRedirect("admin/index.jsp");
			}
			
			else {
				session.setAttribute("error", "Doctor not registered");
				resp.sendRedirect("index.jsp");
				
			}
			
		}
		
		catch(Exception  e)
		{
		   e.printStackTrace();
		}
	}
	

}
