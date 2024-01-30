package com.raghu.comp;

public class Customer extends Person{
	private int txid;
	private double billAmount;
	
	public Customer(String name, String addrs, AadharDetails aadhar, int txid, double billAmount) {
		super(name, addrs, aadhar);
		System.out.println("Customer: 5-param constructor");
		this.txid=txid;
		this.billAmount=billAmount;
	}

	
	@Override
	public String toString() {
		return super.toString()+"Customer [txid=" + txid + ", billAmount=" + billAmount + "]";
	}
	
	

}
