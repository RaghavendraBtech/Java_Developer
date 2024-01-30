package com.raghu.comps;

public final class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("Bluedart:: 0-param construtor");
	}

	@Override
	public String deliver(int oid) {
		return oid+"order id oder is assigned to BlueDart for Delivery ";
	}

}
