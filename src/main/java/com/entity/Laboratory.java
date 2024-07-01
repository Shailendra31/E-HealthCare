package com.entity;

public class Laboratory {

	private int lab_Id;
	private String lab_name;
	
	
	public Laboratory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Laboratory(int lab_Id, String lab_name) {
		super();
		this.lab_Id = lab_Id;
		this.lab_name = lab_name;
	}


	public int getLab_Id() {
		return lab_Id;
	}


	public void setLab_Id(int lab_Id) {
		this.lab_Id = lab_Id;
	}


	public String getLab_name() {
		return lab_name;
	}


	public void setLab_name(String lab_name) {
		this.lab_name = lab_name;
	}
	
	
	
	
}
