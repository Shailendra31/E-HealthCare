package com.LabInc;

import java.io.IOException;

import com.dao.LabInchargeDao;
import com.db.DBConnect;
import com.entity.LabIncharge;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;



@WebServlet("/labIncLogin")
public class LabIncLogin extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			
			
			String email = req.getParameter("Lemail");
			String password = req.getParameter("Lpassword");
			
			
			HttpSession session = req.getSession();
			
			LabInchargeDao dao = new LabInchargeDao(DBConnect.getConn());
			LabIncharge l =dao.labIncLogin(email , password);
			
			if(l != null)
			{
				session.setAttribute("labObj", l);
				resp.sendRedirect("LabInc/index.jsp");
			}
			else {
				session.setAttribute("errorMsg", "Invalid Email or Password");
				resp.sendRedirect("LabInc_login.jsp");
				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}	}
	
	
	


}
