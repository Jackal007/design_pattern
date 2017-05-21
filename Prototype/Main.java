package prototype;

public class Main {

	public static void main(String[] args){
		Sheep Mary=new Sheep("Mary", "female","white");
		Mary.show();
		Sheep Dolly=(Sheep)Mary.clone("Dolly");
		Dolly.show();
	}
}
