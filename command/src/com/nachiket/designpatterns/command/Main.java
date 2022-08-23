package com.nachiket.designpatterns.command;

public class Main {

	public static void main(String[] args) {
		
		Fan hallfan = new Fan();
		
		RemoteController remote = new RemoteController();
		remote.setCommand(new TurnFanOn(hallfan));
		remote.execute();	
		
		remote.setCommand(new TurnFanOff(hallfan));
		remote.execute();	
		
	}
	
}
