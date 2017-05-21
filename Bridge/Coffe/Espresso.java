package Bridge.Coffe;

import Bridge.CupSize.CupSize;
import Bridge.Foam.Foam;
import Bridge.Milk.Milk;

public class Espresso extends Coffe{

	public Espresso(CupSize cupSize,Milk milk,Foam foam) {
		super("Espresso",cupSize,milk,foam);
	}

}
