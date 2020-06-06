package task1;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circuit a = new Resistor(sc.nextDouble());
		Circuit b = new Resistor(sc.nextDouble()); 
		Circuit f = new Series(a, b);
		System.out.print("Series:"+f.getPotentialDifference());
		System.out.print("Series:"+f.getPotentialDifference());
		Circuit c = new Resistor(sc.nextDouble()); 
		Circuit d = new Resistor(sc.nextDouble());
		Circuit g = new Parallel(c, d);	
		System.out.print("Parallel"+g.getResistance());
		Circuit e = new Resistor(sc.nextDouble()); 
		Circuit h = new Series(g, e);
		Circuit circuit = new Parallel(h, f); 
		System.out.println(circuit.getResistance());
		System.out.print(circuit.getPotentialDifference());

		
	}

}
