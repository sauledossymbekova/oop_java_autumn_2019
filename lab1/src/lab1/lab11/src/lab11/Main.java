package lab11;
import java.util.Scanner;
public class Main {
	public static void print(String s) {
		for(int i = 0; i < s.length() + 2; i++) {
			if (i == 0) 
				System.out.print('+');
			else if (i == s.length() +  1) System.out.println('+');
			else System.out.print('-');
		}
	}
	public static void printName(String s) {
		for(int i = 0; i < s.length() + 2; i++) {
			if (i == 0) 
				System.out.print('|');
			else if (i == s.length() + 1) 
				System.out.println('|');
			else System.out.print(s.charAt(i - 1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Main.print(name);
		Main.printName(name);
		Main.print(name);
	}

}
