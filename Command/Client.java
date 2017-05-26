package Command;

public class Client {
	public static void main(String[] args){
		Receiver receiver=new Receiver();
		Command command=new ConcreteCommand(receiver);
		Invoker invoker=new Invoker(command);
		invoker.actionA();
	}
}
