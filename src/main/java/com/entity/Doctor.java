package com.entity;

public class Doctor {
	
	private int rid;
	private String firstname;
	private String lastname;
	private String dob;
	private String emailaddress;
	private String mobile;
	private String password;
	private String department;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
     
	 
	
	
	
	public Doctor(String firstname, String lastname, String dob, String emailaddress, String mobile,
			String password, String department) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.emailaddress = emailaddress;
		this.mobile = mobile;
		this.password = password;
		this.department = department;
	}





	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	
	

}
