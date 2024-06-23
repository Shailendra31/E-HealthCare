package com.entity;

public class Doctor {
	
	private String rid;
	private String firstname;
	private String lastname;
	private String dob;
	private String emailaddress;
	private String mobile;
	private String password;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String rid, String firstname, String lastname, String dob, String emailaddress, String mobile,
			String password) {
		super();
		this.rid = rid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dob = dob;
		this.emailaddress = emailaddress;
		this.mobile = mobile;
		this.password = password;
	}
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
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
	
	
	

}
