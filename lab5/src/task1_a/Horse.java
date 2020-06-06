package task1_a;

public class Horse implements Actionable{

	@Override
	public void move() {
		System.out.print("CHOCK");
		
	}

	@Override
	public void sound() {
		System.out.print("Igogog");
	}
	
}
