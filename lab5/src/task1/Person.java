package task1;

public class Person implements Walkable, Swimming{
	int foot;
	int hands;
	public Person() {
		this.foot=2;
		this.hands=2;
	}
	public Person(int foot, int hands) {
		this.foot = foot;
		this.hands = hands;
	}
	@Override
	public boolean canWalk() {
		return this.foot!=0;
	}
	@Override
	public boolean canSwim() {
		return this.foot!=0 && this.hands!=0;
	}
	public void setInvalid(boolean b) {
		if (b) this.foot=0;
		else this.foot=2;
	}
	@Override
	public boolean canMove() {

		return this.foot>0 || this.hands>0 ;
	}
	
}
