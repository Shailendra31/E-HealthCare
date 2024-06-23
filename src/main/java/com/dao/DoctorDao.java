package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;

public class DoctorDao {

	private Connection conn;


  
	
	
	public DoctorDao(Connection conn) {
		super();
		this.conn = conn;
	}





	public boolean registerDoctor(Doctor d)
	{
		boolean f = false;
		
		try {
			
			
			String sql = "insert into doctor(rid,first_name,last_name, dob, emailaddress, mobile, password ) values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setString(1, d.getRid());
			ps.setString(2, d.getFirstname());
			ps.setString(3, d.getLastname());
			ps.setString(4, d.getDob());
			ps.setString(5, d.getEmailaddress());
			ps.setString(6, d.getMobile());
			ps.setString(7, d.getPassword());
			
			int i = ps.executeUpdate();
			
			
			if(i==1)
			{
				f = true;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();			
		}
		return f;
		
	
	}
	
	
	public List<Doctor> getAllDoctor()
	{
		List <Doctor>list = new ArrayList<Doctor>();
		
		Doctor d = null;
		
		try {
			String sql = "select * from doctor";
			PreparedStatement ps  = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				d = new Doctor();
				
				
				d.setRid(rs.getString(1));
				d.setFirstname(rs.getString(2));
				d.setLastname(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setEmailaddress(rs.getString(5));
				d.setMobile(rs.getString(6));
			    d.setPassword(rs.getString(7));
			  list.add(d);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
}
