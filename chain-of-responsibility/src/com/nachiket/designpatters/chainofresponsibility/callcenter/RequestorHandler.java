package com.nachiket.designpatters.chainofresponsibility.callcenter;

public class RequestorHandler {
	
	AbstractHandler handler;
	
	RequestorHandler(){
		buildChain();
	}
	
	public void buildChain() {
		
		handler = new BillingSupportHandler(new TechnicalSupportHandler(new GeneralSupportHandler(null, "general"), "technical"), "billing");
		
		
	}
	
	public void makeRequest(String level, String message) {
		
		handler.receiveRequest(level, message);
		
	}

}
