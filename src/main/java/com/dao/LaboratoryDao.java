package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.entity.Laboratory;

public class LaboratoryDao {
	
	 private Connection conn;

		
		 
		public LaboratoryDao(Connection conn) {
		super();
		this.conn = conn;
	}


		public boolean addLab(String lab_name)
		{
			boolean f = false;
			try {
				String sql = "insert into laboratory(lab_name) values(?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, lab_name);
				
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
		 
		
	 public List<Laboratory> getAllLab(){
		 
		 List<Laboratory> list1 = new ArrayList<Laboratory>();
		 
		 Laboratory s = null;
		 try {
			 String sql = "select * from laboratory";
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery()	;
			 
			 while(rs.next())
			 {
				 s = new Laboratory();
			     s.setLab_Id(rs.getInt(1)); 
			     s.setLab_name(rs.getString(2));
				 
				 list1.add(s);
			 }
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 
		 }
		 
		 
		 return list1;
	 
	 }

}
