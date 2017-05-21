package Bridge.CupSize;

public abstract class CupSize {
	protected String type;
	
	public CupSize(String type){
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
