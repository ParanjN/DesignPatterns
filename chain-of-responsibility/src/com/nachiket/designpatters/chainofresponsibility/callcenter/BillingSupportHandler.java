package com.nachiket.designpatters.chainofresponsibility.callcenter;

public class BillingSupportHandler extends AbstractHandler {
	
	BillingSupportHandler(AbstractHandler nextHandler, String level){
			super(nextHandler, level);
	}
	
	
	@Override
	public void handleRequest(String message) {
	
			System.out.println("message: " + message);
	}
}

