package lab1_5;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // general sum
		int p = sc.nextInt(); //percent
		System.out.println("General:" + c + (( p * c)/100));
	}

}
