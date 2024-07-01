package com.entity;

public class Report {
	
	private int id;
	private int uuid;
	private String uname;
	private String email;
	private String file;
	private String remarks;
	
	
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Report(int uuid, String uname, String email, String file, String remarks) {
		super();
		this.uuid = uuid;
		this.uname = uname;
		this.email = email;
		this.file = file;
		this.remarks = remarks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUuid() {
		return uuid;
	}


	public void setUuid(int uuid) {
		this.uuid = uuid;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
