package task1;

public class Fish extends Animal implements Swimming{
	int amountOfGills;
	public Fish() {
		super();
		amountOfGills=2;
	}
	public Fish(String name, String type, String sound, int amountOfGills) {
		super(name,type,sound);
		this.amountOfGills = amountOfGills;
		
	}
	public String getInfo() {
		return super.getInfo() + "Lion's amount of legs:" + this.amountOfGills ;
	}
	@Override
	public String getSound(String sound) {
		return "Bulk";
	}
	@Override
	public boolean canSwim() {
		return this.amountOfGills>2;
	}
	@Override
	public boolean canMove() {
		return this.amountOfGills>1;
	}
	
	
	

}
