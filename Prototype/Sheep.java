package prototype;

public class Sheep implements Cloneable {

	String name;
	String sex;
	String color;
	
	public Sheep(String name,String sex,String color){
		this.name=name;
		this.sex=sex;
		this.color=color;
	}
	
	public void show(){
		System.out.println("I am a "+color+" "+sex+" sheep named "+name);
	}
	
	public Object clone(String newName) {
		Object clone = null;
		try {
			String t=name;
			name=newName;
			clone = super.clone();
			name=t;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clone;
	}

}
