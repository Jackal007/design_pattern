package Bridge.Coffe;

import Bridge.CupSize.CupSize;
import Bridge.Foam.Foam;
import Bridge.Milk.Milk;

public abstract class Coffe {

	public String type;
	public CupSize cupSize;
	public Milk milk;
	public Foam foam;

	public Coffe(String name,CupSize cupSize,Milk milk,Foam foam) {
		this.type = name;
		this.cupSize = cupSize;
		this.milk = milk;
		this.foam = foam;
	}

	public void makeCoffe() {
		String result = "coffee " + getType() + ",";
		result += " size is " + getCupSize().getType() + ",";
		result += " add "+ getMilk().getType() +" milk" + ",";
		result += " add "+ getFoam().getType() +" foam" ;
		System.out.println(result);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CupSize getCupSize() {
		return cupSize;
	}

	public void setCupSize(CupSize cupSize) {
		this.cupSize = cupSize;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public Foam getFoam() {
		return foam;
	}

	public void setFoam(Foam foam) {
		this.foam = foam;
	}

}
