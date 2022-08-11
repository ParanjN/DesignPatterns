package com.nachiket.designpatters.chainofresponsibility.callcenter;

public class Main {
	
	public static void main(String[] args) {
		
		// get chain
		RequestorHandler handler = new RequestorHandler();
		
		handler.makeRequest("technical", "Hi General");
		
	}

}
