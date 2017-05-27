package Factory.AbstractFactory.amd;

import Factory.AbstractFactory.AbstractFactory;
import Factory.AbstractFactory.Cpu;
import Factory.AbstractFactory.Mainboard;
import Factory.AbstractFactory.intel.IntelCpu;
import Factory.AbstractFactory.intel.IntelMainboard;

public class AmdFactory implements AbstractFactory {
	@Override
	public Cpu createCpu() {
		return new IntelCpu(938);
	}

	@Override
	public Mainboard createMainboard() {
		return new IntelMainboard(938);
	}
}
