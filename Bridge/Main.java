package Bridge;

import Bridge.Coffe.*;
import Bridge.CupSize.*;
import Bridge.CupSize.Short;
import Bridge.Foam.*;
import Bridge.Milk.*;

public class Main {
	public static void main(String[] args) {
		CupSize cupSize = new Short();
		Milk milk = new Soy();
		Foam foam = new Extra();
		Coffe coffe = new Mocha(cupSize, milk, foam);
		coffe.makeCoffe();
		
		coffe=new American(new Tall(),new LowFat(),new Extra());
		coffe.makeCoffe();
		
	}
}
