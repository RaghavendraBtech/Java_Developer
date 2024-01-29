package com.raghu.beans;

public class AddresBean {
	
	private Integer hno;
	private String city;
	private String state;
	
	public AddresBean() {
		super();
	}

	public AddresBean(Integer hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}
	// setters and getters
	public Integer getHno() {
		return hno;
	}
	public void setHno(Integer hno) {
		this.hno = hno;
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
	//toString
	@Override
	public String toString() {
		return "AddresBean [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	

}
