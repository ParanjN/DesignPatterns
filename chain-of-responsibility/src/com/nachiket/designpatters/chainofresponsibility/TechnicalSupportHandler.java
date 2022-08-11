package com.nachiket.designpatters.chainofresponsibility;

public class TechnicalSupportHandler extends AbstractSupportHandler {

	public TechnicalSupportHandler(int level) {
		this.level = level;
	}
	
	@Override
	protected void handleRequest(String message) {
		System.out.println("Technical support handler: Processing request: " + message);
	}
	
}
