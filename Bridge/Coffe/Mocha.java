package Bridge.Coffe;

import Bridge.CupSize.CupSize;
import Bridge.Foam.Foam;
import Bridge.Milk.Milk;

public class Mocha extends Coffe {

	public Mocha(CupSize cupSize, Milk milk, Foam foam) {
		super("Mocha", cupSize, milk, foam);
	}

	@Override
	public void makeCoffe() {
		String result = "coffee " + getType() + ",";
		result += " size is " + getCupSize().getType() + ",";
		result += " add " + getFoam().getType() + " foam" + ",";
		result += " add " + getMilk().getType() + " milk";
		System.out.println(result);
	}

}
