package Bridge.Coffe;

import Bridge.CupSize.CupSize;
import Bridge.Foam.Foam;
import Bridge.Milk.Milk;

public class Cappuccion extends Coffe{

	public Cappuccion(CupSize cupSize,Milk milk,Foam foam) {
		super("Mocha",cupSize,milk,foam);
	}
}
