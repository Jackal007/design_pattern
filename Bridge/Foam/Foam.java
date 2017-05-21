package Bridge.Foam;

public abstract class Foam {
	protected String type;

	public Foam(String type){
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
