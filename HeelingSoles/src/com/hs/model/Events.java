package com.hs.model;

import java.util.Date;

public class Events {

	private int event_id;
	private String title;
	private String addrs_1;
	private String addrs_2;
	private String city;
	private String state;
	private int zipcode;
	private String country;
	private Date date_time;
	private String desc;
	
	
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
