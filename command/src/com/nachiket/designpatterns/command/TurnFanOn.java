package com.nachiket.designpatterns.command;

public class TurnFanOn implements ICommand{
	
	Fan fan;
	
	public TurnFanOn(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.turnOn();
	}

}
