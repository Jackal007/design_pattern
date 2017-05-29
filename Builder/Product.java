package Builder;

public class Product {
	SubProduct1 subProduct1;
	SubProduct2 subProduct2;

	public SubProduct1 getSubProduct1() {
		return subProduct1;
	}

	public void setSubProduct1(SubProduct1 subProduct1) {
		this.subProduct1 = subProduct1;
	}

	public SubProduct2 getSubProduct2() {
		return subProduct2;
	}

	public void setSubProduct2(SubProduct2 subProduct2) {
		this.subProduct2 = subProduct2;
	}

	@Override
	public String toString() {
		return "Product [subProduct1=" + subProduct1 + ", subProduct2=" + subProduct2 + "]";
	}

}
