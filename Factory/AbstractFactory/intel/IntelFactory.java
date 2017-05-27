package Factory.AbstractFactory.intel;

import Factory.AbstractFactory.AbstractFactory;
import Factory.AbstractFactory.Cpu;
import Factory.AbstractFactory.Mainboard;

public class IntelFactory implements AbstractFactory {
	@Override
	public Cpu createCpu() {
		return new IntelCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		return new IntelMainboard(755);
	}
}
