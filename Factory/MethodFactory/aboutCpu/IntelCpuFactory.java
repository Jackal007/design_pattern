package Factory.MethodFactory.aboutCpu;

public class IntelCpuFactory implements CpuFactory {

	@Override
	public Cpu createCpu() {
		return new IntelCpu(755);
	}

}
