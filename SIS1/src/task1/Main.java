package task1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Temperature t = new Temperature(36, 'F');
	    Scanner sc = new Scanner(System.in);
	    /*double d = sc.nextDouble();
	    String s = sc.next();
	    char c = s.charAt(0);*/
	    System.out.println(t.getInF());
	    System.out.println(t.getInF() + " " + t.getScale());
	}

}
