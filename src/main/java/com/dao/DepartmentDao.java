package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Department;

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
			String sql = "insert into departments(department_name) values(?)";
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
	 
	
 public List<Department> getAllDepartment(){
	 
	 List<Department> list1 = new ArrayList<Department>();
	 
	 Department s = null;
	 try {
		 String sql = "select * from departments";
		 PreparedStatement ps = conn.prepareStatement(sql);
		 ResultSet rs = ps.executeQuery()	;
		 
		 while(rs.next())
		 {
			 s = new Department();
			 s.setId(rs.getInt(1));
			 s.setDepartment(rs.getString(2));
			 
			 list1.add(s);
		 }
		 
	 }catch(Exception e) {
		 e.printStackTrace();
		 
	 }
	 

	 
	 
	 
	return list1;
	 
	 
	 
	 
 }
	 
}
