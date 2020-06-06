package task1;

public class Test {

	public static void main(String[] args) {
		
		Fish fish = new Fish();
		
		System.out.println(fish.canSwim());
		
		int a=2;
		Person person = new Person( a, a);
		System.out.println(person.canWalk());
		person.setInvalid(true);
		System.out.println(person.canWalk());
		
		
	}

}
