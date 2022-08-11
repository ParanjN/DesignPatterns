package com.nachiket.designpatters.chainofresponsibility;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Inside main function");
		
		AbstractSupportHandler handler = RequestorClient.getHandlerChain();
//		System.out.println(handler.level);
		
		handler.receiveRequest(AbstractSupportHandler.TECHNICAL, "Technical");
		System.out.println(".........................");
		
		handler.receiveRequest(AbstractSupportHandler.BILLING, "Billing");
		System.out.println(".........................");
		
		handler.receiveRequest(AbstractSupportHandler.GENERAL, "General");
		System.out.println(".........................");
		
		
	}

}
