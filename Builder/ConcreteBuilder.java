package Builder;

public class ConcreteBuilder implements Builder {

	private Product finalProduct = new Product();
	private SubProduct1 product1 = new SubProduct1();
	private SubProduct2 product2 = new SubProduct2();

	/**
	 * 产品零件建造方法1
	 */
	@Override
	public void buildPart1() {
		// 构建产品的第一个零件
		product1.setPart1("编号：0101");
		product2.setPart1("编号：0201");
	}

	/**
	 * 产品零件建造方法2
	 */
	@Override
	public void buildPart2() {
		// 构建产品的第二个零件
		product1.setPart2("编号：0102");
		product2.setPart2("编号：0202");
	}

	/**
	 * 产品返还方法
	 */
	@Override
	public Product retrieveResult() {
		finalProduct.setSubProduct1(product1);
		finalProduct.setSubProduct2(product2);
		return finalProduct;
	}
}
