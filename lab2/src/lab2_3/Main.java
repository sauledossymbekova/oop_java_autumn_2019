package lab2_3;
import java.util.Scanner;

public class Main { //Analyzer

	public static void main(String[] args) {
		Data d = new Data(); 
		Scanner sc = new Scanner(System.in);
		while(true) { //till we input
			System.out.println("Enter number: (Q to quit)");
			String input = sc.nextLine();
			if (input.equals("Q") || input.equals("q")) { //if Q then stop
				break;
			}
			else {
				double f = Double.parseDouble(input); //if inputed then adds
				d.addToSet(f);
			}
		}
		System.out.println(d.Average() + " " + d.Largest());
	}

}
