package Bridge.Coffe;

import Bridge.CupSize.CupSize;
import Bridge.Foam.Foam;
import Bridge.Milk.Milk;

public class American extends Coffe{

	public American(CupSize cupSize,Milk milk,Foam foam) {
		super("American",cupSize,milk,foam);
	}
}
