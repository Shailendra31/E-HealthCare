package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Appointment;

public class AppointmentDao {
	
	private Connection conn;

	public AppointmentDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addAppointment(Appointment ap)
	{
		boolean f= false;
		try {
			String sql= "insert into appointment (uid, diseases, doa, rid, status) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, ap.getUid());
			ps.setString(2,ap.getDiseases());
			ps.setString(3, ap.getDoa());
			ps.setInt(4, ap.getRid());
			ps.setString(5, ap.getStatus());
			
			int i = ps.executeUpdate();
			
			if(i==1)
			{
				f =true;
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	
	
	public List<Appointment> getAllAppointmentById(int userId)
	{
		List<Appointment> list = new ArrayList<Appointment>();
		Appointment ap = null;
		
		try {
			String sql = "select * from appointment where uid =?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, userId);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				ap = new Appointment();
				
				ap.setAid(rs.getInt(1));
				ap.setUid(rs.getInt(2));
				ap.setDiseases(rs.getString(3));
				ap.setDoa(rs.getString(4));
				ap.setRid(rs.getInt(5));
				ap.setStatus(rs.getString(6));
				
				
				list.add(ap);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
		
	}
	
	public boolean deleteAppointment(int aid) 
	{
		boolean f = false;
		
		try {
		
		String sql = "delete from appointment where aid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, aid);
		
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

}
