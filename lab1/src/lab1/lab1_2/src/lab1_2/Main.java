package lab1_2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Area:" + a * a ) ;
		System.out.println("Perimeter:" + a * 4) ;
		System.out.println("Length of diagonal:" + a * Math.sqrt(1.0 * a));
	}

}
