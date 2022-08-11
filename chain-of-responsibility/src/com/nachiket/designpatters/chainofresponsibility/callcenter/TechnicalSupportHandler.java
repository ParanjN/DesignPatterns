package com.nachiket.designpatters.chainofresponsibility.callcenter;

public class TechnicalSupportHandler extends AbstractHandler {

	
	TechnicalSupportHandler(AbstractHandler nextHandler, String level){
		
		super(nextHandler, level);
}
	
	@Override
	public void handleRequest(String message) {
	
			System.out.println("message: " + message);
	}
	
}
