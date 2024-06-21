package com.entity;

public class Department {
	
	private int id;
	private String Department;
	
	
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int id, String department) {
		super();
		this.id = id;
		Department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	
	

}
