package Bridge.Milk;

public abstract class Milk {
	protected String type;
	
	public Milk(String type){
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
