package com.Admin;

import java.io.IOException;

import com.dao.LaboratoryDao;
import com.db.DBConnect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/add_lab")
public class AddLaboratory extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
		    
			String lab = req.getParameter("lab");
			
			LaboratoryDao dao = new LaboratoryDao(DBConnect.getConn());
			boolean f = dao.addLab(lab);
			
			HttpSession session = req.getSession();
			
			if(f)
			{
				session.setAttribute("succMsg","Lab Added");
				resp.sendRedirect("admin/index.jsp");
			}
			else {
				session.setAttribute("errMsg", "invalid Email or Password");
				System.out.print(f);
				resp.sendRedirect("admin/index.jsp");
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	

}
