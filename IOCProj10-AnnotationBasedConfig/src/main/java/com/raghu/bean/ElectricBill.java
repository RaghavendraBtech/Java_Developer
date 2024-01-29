package com.raghu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ElectricBill {
	
	@Value("12345")
	private Integer cno;
	@Value("Raghu")
	private String cName;
	@Value("1567")
	private Integer currentRead;
	@Value("765")
	private Integer previousRead;
	
	public ElectricBill() {
		super();
	}

	public ElectricBill(Integer cno, String cName, Integer currentRead, Integer previousRead) {
		super();
		this.cno = cno;
		this.cName = cName;
		this.currentRead = currentRead;
		this.previousRead = previousRead;
	}
	
	//  setters and getters
	public Integer getcno() {
		return cno;
	}
	public void setcno(Integer cno) {
		this.cno = cno;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getCurrentRead() {
		return currentRead;
	}
	public void setCurrentRead(Integer currentRead) {
		this.currentRead = currentRead;
	}
	public Integer getPreviousReadl() {
		return previousRead;
	}
	public void setPreviousRead(Integer previousRead) {
		this.previousRead = previousRead;
	}
	
	public void printBill() {
		int consumedUnits=currentRead-previousRead;
		double totalBill=0.0;
		if(consumedUnits<200) {
			totalBill=consumedUnits*1.75;
		}
		else if(consumedUnits>=200 && consumedUnits<500 ) {
			totalBill=consumedUnits*5.25;
		}
		else{
			totalBill=consumedUnits*7.25;
		}
		System.out.println("consumer no: "+cno);
		System.out.println("consumer Name: "+cName);
		System.out.println("current read: "+currentRead);
		System.out.println("previous read: "+previousRead);
		System.out.println("consumer units: "+consumedUnits);
		System.out.println("Total Bill: "+totalBill);
	}

}
