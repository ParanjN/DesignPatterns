package com.nachiket.designpatterns.command;

public class TurnFanOff implements ICommand{
	
	Fan fan;
	
	public TurnFanOff(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Fan tuned off");
		
	}

}
