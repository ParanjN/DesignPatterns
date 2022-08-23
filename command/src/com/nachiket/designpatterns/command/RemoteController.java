package com.nachiket.designpatterns.command;

public class RemoteController {
	
	ICommand command;
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}

}
