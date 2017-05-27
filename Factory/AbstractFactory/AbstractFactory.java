package Factory.AbstractFactory;

//创建一组产品
public interface AbstractFactory {
	/**
	 * 创建CPU对象
	 * 
	 * @return CPU对象
	 */
	public Cpu createCpu();

	/**
	 * 创建主板对象
	 * 
	 * @return 主板对象
	 */
	public Mainboard createMainboard();
}
