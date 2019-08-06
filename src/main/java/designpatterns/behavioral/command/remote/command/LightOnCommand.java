package designpatterns.creational.command.remote.command;

import designpatterns.creational.command.remote.receiver.Light;

public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
