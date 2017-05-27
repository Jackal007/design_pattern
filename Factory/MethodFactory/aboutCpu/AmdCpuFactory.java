package Factory.MethodFactory.aboutCpu;

public class AmdCpuFactory implements CpuFactory {

	@Override
	public Cpu createCpu() {
		return new AmdCpu(938);
	}

}
