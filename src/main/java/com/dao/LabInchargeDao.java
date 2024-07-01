package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;
import com.entity.LabIncharge;

public class LabInchargeDao {
	private Connection conn;

	public LabInchargeDao(Connection conn) {
		super();
		this.conn = conn;
	}
    
	
	public boolean registerLabIncharge(String firstname ,String lastname,String dob ,String email,String mobile ,String password ,String lab)
	{
		boolean f = false;
		
		try {
			
			
			String sql = "insert into lab_incharge(first_name, last_name, dob, emailaddress, mobile, password, lab) values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
		
			ps.setString(1, firstname );
			ps.setString(2,lastname );
			ps.setString(3, dob);
			ps.setString(4, email );
			ps.setString(5,mobile );
			ps.setString(6,password);
			ps.setString(7, lab);
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
	
	public List<LabIncharge> getAllLabIncharge()
	{
		List <LabIncharge>list = new ArrayList<LabIncharge>();
		
		LabIncharge l = null;
		
		try {
			String sql = "select * from lab_incharge";
			PreparedStatement ps  = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				l = new LabIncharge();
				
				l.setLid(rs.getInt(1));
				l.setFirst_name(rs.getString(2));
				l.setLast_name(rs.getString(3));
				l.setDob(rs.getString(4));
				l.setEmailaddress(rs.getString(5));
				l.setMobile(rs.getString(6));
			    l.setPassword(rs.getString(7));
			    l.setLab(rs.getString(8));
			    list.add(l);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	
	public LabIncharge labIncLogin(String email , String pass)
	{
		LabIncharge l = null;
		
		try {
			
			String sql = "select *  from lab_incharge where emailaddress = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery() ;
			
			while(rs.next())
			{
				l = new LabIncharge();
				
				l.setLid(rs.getInt(1));
				l.setFirst_name(rs.getString(2));
				l.setLast_name(rs.getString(3));
				l.setDob(rs.getString(4));
				l.setEmailaddress(rs.getString(5));
				l.setMobile(rs.getString(6));
			    l.setPassword(rs.getString(7));
			    l.setLab(rs.getString(8));

			}
			
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}
		
		return l;
		
		
	}

	


}
