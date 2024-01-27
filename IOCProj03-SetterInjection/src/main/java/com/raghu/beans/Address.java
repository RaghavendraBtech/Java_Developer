package com.raghu.beans;

public class Address {
	private Integer hno;
	private String city;
	private String state;
	

	public void setHno(Integer hno) {
		this.hno = hno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", state=" + state + "]";
	}
	

}
