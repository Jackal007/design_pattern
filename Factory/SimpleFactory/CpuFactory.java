package Factory.SimpleFactory;

import Factory.SimpleFactory.cpu.AmdCpu;
import Factory.SimpleFactory.cpu.Cpu;
import Factory.SimpleFactory.cpu.IntelCpu;

public class CpuFactory {
	public static Cpu createCpu(int type) {
		Cpu cpu = null;
		if (type == 1) {
			cpu = new IntelCpu(755);
		} else if (type == 2) {
			cpu = new AmdCpu(938);
		}
		return cpu;
	}
}
