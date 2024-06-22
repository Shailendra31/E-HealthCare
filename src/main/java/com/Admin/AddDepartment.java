package com.Admin;

import java.io.IOException;

import com.dao.DepartmentDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/add_dept")
public class AddDepartment extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1511113729269581192L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	try {
	    
		String dept = req.getParameter("department");
		
		DepartmentDao dao = new DepartmentDao(DBConnect.getConn());
		boolean f = dao.addDepartment(dept);
		
		HttpSession session = req.getSession();
		
		if(f)
		{
			session.setAttribute("succMsg","Department Added");
			resp.sendRedirect("admin/index.jsp");
		}
		else {
			session.setAttribute("errMsg", "invalid Email or Password");
			resp.sendRedirect("admin/index.jsp");
			
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
	}
	
	

}
