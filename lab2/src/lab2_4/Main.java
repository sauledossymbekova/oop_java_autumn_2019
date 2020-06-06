package lab2_4;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int second = sc.nextInt();
		Time t = new Time(hour, minute, second);
		
		System.out.println("Standart" + t.toStandard());
		System.out.println("Universal" + t.toUniversal());
		
		int hour2 = sc.nextInt();
		int minute2 = sc.nextInt();
		int second2 = sc.nextInt();
		Time t2 = new Time(hour2, minute2, second2);
		t.add(t2);
		System.out.println(t.toStandard());
	}

}
