package task1;

public class Lion extends Animal implements Walkable {
	int amountOfLegs;
	public Lion() {
		super();
		int amountOfLegs=4;
	}
	public Lion(String name, String type, String sound, int amountOfLegs) {
		super(name,type,sound);
		this.amountOfLegs = amountOfLegs;
	}
	public String getInfo() {
		return super.getInfo() + "Lion's amount of legs:" + this.amountOfLegs ;
	}
	@Override
	public String getSound(String sound) {
		return "Whhhraaau";
	}
	@Override
	public boolean canWalk() {
		return this.amountOfLegs==2;
	}
	@Override
	public boolean canMove() {
		return this.amountOfLegs>0;
	}
}
