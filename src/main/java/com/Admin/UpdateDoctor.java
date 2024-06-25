package com.Admin;

import java.io.IOException;

import com.dao.DoctorDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/update_Doctor")
public class UpdateDoctor extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5640210073226187759L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub


		try {
			
			
			int rid = Integer.parseInt(req.getParameter("rid"));
			String firstname = req.getParameter("firstname");
			String lastname = req.getParameter("lastname");
			String dob = req.getParameter("dob");
			String email = req.getParameter("emailaddress");
			String mobile = req.getParameter("mobile");
			String password = req.getParameter("password");
			String department = req.getParameter("spec");
			
			
			
			
			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			boolean f = dao.updateDoctor(rid,firstname ,lastname, dob , email, mobile , password , department);
			
			HttpSession session = req.getSession();
			
			if(f)
				
			{
				session.setAttribute("success", "Doctor registered");
				resp.sendRedirect("admin/viewDoctor.jsp");
				
			}
			
			else {
				session.setAttribute("error", "Doctor not registered");
				resp.sendRedirect("admin/viewDoctor.jsp");
				
			}
			
		}
		
		catch(Exception  e)
		{
		   e.printStackTrace();
		}
	}
}
	
	




   