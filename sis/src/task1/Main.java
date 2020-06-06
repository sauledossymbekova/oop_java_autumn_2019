package task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t = new Temperature(32, 'C');
        System.out.println(t.getTemperatureInF());
        t.setScale('F');
        System.out.println(t.getTemperatureInF() + " " + t.getScale());
	}

}
