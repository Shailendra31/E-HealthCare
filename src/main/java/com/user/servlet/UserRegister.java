package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

import jakarta.servlet.annotation.WebServlet;



public class UserRegister extends HttpServlet{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2694296362743031795L;

	/**
	 * 
	 */

	
	
	 public UserRegister() {
	        super();
	    }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String fullName = req.getParameter("username");
			String email = req.getParameter("emailaddress");
			String password = req.getParameter("password");
			
			
			User u = new User(fullName , email , password );
			
			UserDAO dao = new UserDAO(DBConnect.getConn());
			boolean f = dao.register(u);
			
			
			
			if(f)
			{
				System.out.println("data inserted ");
			}
			else {
				System.out.println("data not inserted ");
			}
			
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
	}

	{
}

}
