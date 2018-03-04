package com.hs.model;

import java.util.Date;

public class Sign_Up {

	private int cust_id;
	
	private String fname;
	private String mname;
	private String lname;
	
	private Date dob;
	
	private String gender;
	
	private String email_id;
	
	private int contact;
	
	private String addrs_1;
	private String addrs_2;
	private String state;
	private String city;
	private int zipcode;
	private String country;
	
	private String image;

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getAddrs_1() {
		return addrs_1;
	}

	public void setAddrs_1(String addrs_1) {
		this.addrs_1 = addrs_1;
	}

	public String getAddrs_2() {
		return addrs_2;
	}

	public void setAddrs_2(String addrs_2) {
		this.addrs_2 = addrs_2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
