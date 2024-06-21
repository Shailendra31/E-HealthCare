package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DepartmentDao {

	
	 private Connection conn;

	public DepartmentDao(Connection conn) {
		super();
		this.conn = conn;
	}
	 
	public boolean addDepartment(String dep)
	{
		boolean f = false;
		try {
			String sql = "insert into departments(dep_name) values(?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dep);
			
			int i = ps.executeUpdate();
			
			if(i == 1) {
				f = true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
		
	}
	 
	 
}
