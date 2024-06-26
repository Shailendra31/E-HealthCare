package com.entity;

public class User {
	
	private int id;
	private String fullname;
	private String email;
	private String gender;
	private String dob;
	private int age;
	private String phoneNo;
	private String country;
	private String state;
	private String district;
	private String area;
	private String pincode;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String fullname, String email, String gender, String dob, int age, String phoneNo, String country,
			String state, String district, String area, String pincode, String password) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.phoneNo = phoneNo;
		this.country = country;
		this.state = state;
		this.district = district;
		this.area = area;
		this.pincode = pincode;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
