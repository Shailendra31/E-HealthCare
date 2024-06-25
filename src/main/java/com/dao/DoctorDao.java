package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Doctor;
import com.entity.User;

public class DoctorDao {

	private Connection conn;


  
	
	
	public DoctorDao(Connection conn) {
		super();
		this.conn = conn;
	}

 



	public boolean registerDoctor(String firstname ,String lastname,String dob ,String email,String mobile ,String password ,String department)
	{
		boolean f = false;
		
		try {
			
			
			String sql = "insert into doctor(first_name,last_name, dob, emailaddress, mobile, password ,department) values(?,?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
		
			ps.setString(1, firstname );
			ps.setString(2,lastname );
			ps.setString(3, dob);
			ps.setString(4, email );
			ps.setString(5,mobile );
			ps.setString(6,password);
			ps.setString(7, department);
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
				
				d.setRid(rs.getInt(1));
				d.setFirstname(rs.getString(2));
				d.setLastname(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setEmailaddress(rs.getString(5));
				d.setMobile(rs.getString(6));
			    d.setPassword(rs.getString(7));
			    d.setDepartment(rs.getString(8));
			  list.add(d);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	public  Doctor getDoctorById(int rid)
	{
		
		
		Doctor d = null;
		
		try {
			String sql = "select * from doctor where rid=?";
			PreparedStatement ps  = conn.prepareStatement(sql);
			
			ps.setInt(1,rid);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				d = new Doctor();
				
				d.setRid(rs.getInt(1));
				d.setFirstname(rs.getString(2));
				d.setLastname(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setEmailaddress(rs.getString(5));
				d.setMobile(rs.getString(6));
			    d.setPassword(rs.getString(7));
			    d.setDepartment(rs.getString(8));
			  
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return d;
	}
	
	
	public boolean updateDoctor(int rid ,String firstname ,String lastname,String dob ,String email,String mobile ,String password ,String department)
	{
		boolean f = false;
		
		try {
			
			
			String sql = "update  doctor set first_name =?,last_name=?, dob=?, emailaddress=?, mobile=?, password=? ,department=? where rid = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
		 
			ps.setString(1, firstname );
			ps.setString(2,lastname );
			ps.setString(3, dob);
			ps.setString(4, email );
			ps.setString(5,mobile );
			ps.setString(6,password);
			ps.setString(7, department);
			ps.setInt(8, rid);
			
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
	
	
	public boolean deleteDoctor(int rid) 
	{
		boolean f = false;
		
		try {
		
		String sql = "delete from doctor where rid=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setInt(1, rid);
		
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
	
	
	public Doctor doctorLogin(String email , String pass)
	{
		Doctor d = null;
		
		try {
			
			String sql = "select *  from doctor where emailaddress = ? and password = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pass);
			
			ResultSet rs = ps.executeQuery() ;
			
			while(rs.next())
			{
				d = new Doctor();
				
				d.setRid(rs.getInt(1));
				d.setFirstname(rs.getString(2));
				d.setLastname(rs.getString(3));
				d.setDob(rs.getString(4));
				d.setEmailaddress(rs.getString(5));
				d.setMobile(rs.getString(6));
			    d.setPassword(rs.getString(7));
			    d.setDepartment(rs.getString(8));

			}
			
			
			
		}
		
		catch(Exception e){
			e.printStackTrace();	
		}
		
		return d;
		
		
	}

	
	
}
