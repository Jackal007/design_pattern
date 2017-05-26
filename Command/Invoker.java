package Command;

public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public void actionA() {
		command.execute();
	}

	public void actionB() {
		command.execute();
	}
}
