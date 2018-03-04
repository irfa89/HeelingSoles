package com.hs.model;

public class Dropoff_Location {
	
	private int loc_id;
	
	private String addrs_1;
	private String addrs_2;
	private String state;
	private String city;
	private int zipcode;
	private String country;
	
	private int contact;
	
	private String days;
	private String timing;
	
	public int getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
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
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}

}
