package com.nachiket.designpatters.chainofresponsibility.callcenter;

public class GeneralSupportHandler extends AbstractHandler {

	
	
	GeneralSupportHandler(AbstractHandler nextHandler, String level){
		
		super(nextHandler, level);
	}
	
	
	@Override
	public void handleRequest(String message) {
	
			System.out.println("message: " + message);
	}
	
	
}
