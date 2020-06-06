package task1;

public abstract class Animal {
	String type;
	String name;
	String sound;
	
	public Animal( ) {
		this.name="";
		this.type="";
		this.sound="";
	}
	public Animal(String name, String type, String sound) {
		this.name=name;
		this.type=type;
		this.sound=sound;
	}
	
	public String getInfo() {
		return "Info about animal is:"+this.name + this.type;
	}; //concrete 
	
	public abstract String getSound(String sound); //abstract 
}
