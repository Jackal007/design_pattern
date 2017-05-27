package Factory.SimpleFactory;

public class AmdMainboard implements Mainboard {
	/**
	 * CPU插槽的孔数
	 */
	private int cpuHoles = 0;

	/**
	 * 构造方法，传入CPU插槽的孔数
	 * 
	 * @param cpuHoles
	 */
	public AmdMainboard(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}

	@Override
	public void installCPU() {
		System.out.println("AMD主板的CPU插槽孔数是：" + cpuHoles);
	}
}
