package com.nachiket.designpatters.chainofresponsibility.callcenter;

public abstract class AbstractHandler {
	
	private final AbstractHandler nextHandler;
	private final String level;
	
	AbstractHandler(AbstractHandler nextHandler, String level) {
		this.nextHandler = nextHandler;
		this.level = level;
		
	}
	
	public void receiveRequest(String level, String message) {
		if(this.level.equals(level)) {
			System.out.print("I will handle it myself");
			handleRequest(message);
		}
		else {
System.out.println("Reaching out to another team");
			nextHandler.receiveRequest(level, message);
		}
	}
		

	protected abstract void handleRequest(String message);

}
