package lab1_4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = b * b - 4 * a * c;
		if (d > 0) {
			System.out.println("First root:" + (-b + Math.sqrt(d * 1.0))/ ( 2 * a ));
			System.out.println("Second root:" + (-b - Math.sqrt(d * 1.0))/ ( 2 * a ));
		}
		else if (d == 0) {
			System.out.println("Root:" + ((-b)/ ( 2 * a )));
		}
		else System.out.println("No solutions!");
	}

}
