package com.entity;

public class LabIncharge {
	
	private int lid;
	private String first_name;
	private String last_name;
	private String dob;
	private String emailaddress;
	private String mobile;
	private String password;
	private String lab;
	public LabIncharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LabIncharge(String first_name, String last_name, String dob, String emailaddress, String mobile,
			String password, String lab) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.emailaddress = emailaddress;
		this.mobile = mobile;
		this.password = password;
		this.lab = lab;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public String getLab() {
		return lab;
	}
	public void setLab(String lab) {
		this.lab = lab;
	}

	
	
	
}
