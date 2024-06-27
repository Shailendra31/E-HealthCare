package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entity.Doctor;
import com.entity.User;

public class UserDAO {
	
	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean register(User u)
	{
		boolean f = false;
		
		try {
			
			String sql = "insert into user_dtls(fullname, email, gender, dob, age, phoneNo, country, state, district, area , pincode, password) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,u.getFullname());
			ps.setString(2,u.getEmail());
			ps.setString(3, u.getGender());
			ps.setString(4, u.getDob());
			ps.setInt(5, u.getAge());
			ps.setString(6,u.getPhoneNo());
			ps.setString(7,u.getCountry());
			ps.setString(8, u.getState());
			ps.setString(9, u.getDistrict());
			ps.setString(10, u.getArea());
			ps.setString(11, u.getPincode());
			ps.setString(12, u.getPassword());
			
			int i =ps.executeUpdate();
			
			if(i == 1)
			{
				f = true;
			}
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		return f;
	}
	
	public User login(String email , String pass)
	{
		User u = null;
		
		try {
			
			String sql = "select *  from user_dtls where email = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery() ;
			
			while(rs.next())
			{
				u = new User();
				
				
				u.setId(rs.getInt(1));;
				u.setFullname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDob(rs.getString(5));
				u.setAge(rs.getInt(6));
				u.setPhoneNo(rs.getString(7));
				u.setCountry(rs.getString(8));
				u.setState(rs.getString(9));
				u.setDistrict(rs.getString(10));
				u.setArea(rs.getString(11));
				u.setPincode(rs.getString(12));
				u.setPassword(rs.getString(13));
			}
			
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}
		
		return u;
		
		
	}
	
	public  User getUserById(int id)
	{
		
		
		User u = null;
		
		try {
			String sql = "select * from user_dtls where id=?";
			PreparedStatement ps  = conn.prepareStatement(sql);
			
			ps.setInt(1,id);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				u = new User();
				
				
				u.setId(rs.getInt(1));;
				u.setFullname(rs.getString(2));
				u.setEmail(rs.getString(3));
				u.setGender(rs.getString(4));
				u.setDob(rs.getString(5));
				u.setAge(rs.getInt(6));
				u.setPhoneNo(rs.getString(7));
				u.setCountry(rs.getString(8));
				u.setState(rs.getString(9));
				u.setDistrict(rs.getString(10));
				u.setArea(rs.getString(11));
				u.setPincode(rs.getString(12));
				u.setPassword(rs.getString(13));
			  
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return u;
	}
	

}
