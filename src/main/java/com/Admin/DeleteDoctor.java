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


@WebServlet("/delete_Doctor")
public class DeleteDoctor extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3541951412467457076L;

	/**
	 * 
	 */


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			
			int rid = Integer.parseInt(req.getParameter("rid"));
			
			
			
			
			DoctorDao dao = new DoctorDao(DBConnect.getConn());
			boolean f = dao.deleteDoctor(rid);
			
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
