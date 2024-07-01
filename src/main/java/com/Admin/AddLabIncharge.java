package com.Admin;

import java.io.IOException;

import com.dao.LabInchargeDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/labInc_register")

public class AddLabIncharge extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
       
		 try {
			
			String firstname = req.getParameter("firstname");
			String lastname = req.getParameter("lastname");
			String dob = req.getParameter("dob");
			String email = req.getParameter("emailaddress");
			String mobile = req.getParameter("mobile");
			String password = req.getParameter("password");
			String department = req.getParameter("lab");
			
			
			LabInchargeDao dao = new LabInchargeDao(DBConnect.getConn());
			boolean f = dao.registerLabIncharge(firstname ,lastname, dob , email, mobile , password , department);
			
			HttpSession session = req.getSession();
			
			
			
			
			
			
			
			if(f)
				
			{
				session.setAttribute("success", "Lab Incharge registered");
				resp.sendRedirect("admin/index.jsp");
				
			}
			
			else {
				session.setAttribute("error", "Lab Inchargw not registered");
				resp.sendRedirect("admin/index.jsp");
				
			}
			
		}
		
		catch(Exception  e)
		{
		   e.printStackTrace();
		}
	}
	

	}
	


